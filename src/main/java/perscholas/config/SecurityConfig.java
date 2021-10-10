package perscholas.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter; 
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; 
import org.springframework.security.crypto.password.PasswordEncoder; 
import perscholas.security.AuthenticationSuccessHandlerImpl;
import perscholas.security.UserDetailsServiceImpl;
import perscholas.database.daos.UserDao;
import perscholas.security.AuthenticationFailureHandlerImpl;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration 
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter { 
//	@Autowired
//	AuthenticationSuccessHandlerImpl successHandler;
//	 
//	@Autowired
//	AuthenticationFailureHandlerImpl failureHandler;
	
	@Autowired
	UserDetailsServiceImpl userDetailsService;
	
	@Autowired
	UserDao userDao;
	
   @Bean
   public PasswordEncoder passwordEncoder() { 
      return new BCryptPasswordEncoder(); 
   } 
   
   @Override 
   protected void configure(HttpSecurity http) throws Exception { 
      http 
      .csrf().disable()
      .authorizeRequests().antMatchers("/signup")
      .permitAll().antMatchers("/auth/admin").hasRole("COACH").antMatchers("/auth/*").hasRole("PLAYER").anyRequest().authenticated() 
      .and() 
      .formLogin().loginPage("/login").loginProcessingUrl("/login")
      .permitAll() 
      .and() 
      .logout().logoutUrl("/logout").invalidateHttpSession(true) 
      .clearAuthentication(true) .permitAll().and().rememberMe().key("SR_KEY").tokenValiditySeconds(60 * 60 * 24).rememberMeParameter("remember-me").and().exceptionHandling().accessDeniedPage("/error/404"); 
   }
   
   @Bean
   public DaoAuthenticationProvider getAuthenticationProvider() {
	   DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
	   authenticationProvider.setUserDetailsService(userDetailsService);
	   authenticationProvider.setPasswordEncoder(passwordEncoder());
	   return authenticationProvider;
	   
   }
   
   @Override
   protected void configure(AuthenticationManagerBuilder auth) throws Exception{
	   auth.userDetailsService(userDetailsService);
	   auth.authenticationProvider(getAuthenticationProvider());
   }
   
   }
   


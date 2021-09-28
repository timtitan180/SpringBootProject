package perscholas.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter; 
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; 
import org.springframework.security.crypto.password.PasswordEncoder; 
import perscholas.security.AuthenticationSuccessHandlerImpl;
import perscholas.security.AuthenticationFailureHandlerImpl;
import perscholas.security.UserDetailsServiceImpl;
@Configuration 
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter { 
	@Autowired
	AuthenticationSuccessHandlerImpl successHandler;
	
	@Autowired
	AuthenticationFailureHandlerImpl failureHandler;
	
	@Autowired
	UserDetailsServiceImpl userDetails;
	
   @Bean 
   public PasswordEncoder passwordEncoder() { 
      return new BCryptPasswordEncoder(); 
   } 
   
   @Override 
   protected void configure(HttpSecurity http) throws Exception { 
      http 
      .csrf().disable()
      .authorizeRequests().antMatchers("/createuser**","/login**","/errors**")
      .permitAll() .anyRequest().authenticated() 
      .and() 
      .formLogin().loginPage("/login").loginProcessingUrl("/login").successHandler(successHandler).failureHandler(failureHandler)
      .permitAll() 
      .and() 
      .logout() .invalidateHttpSession(true) 
      .clearAuthentication(true) .permitAll().and().rememberMe().key("SR_KEY").tokenValiditySeconds(60 * 60 * 24).rememberMeParameter("remember-me").and().exceptionHandling().accessDeniedPage("/error/404"); 
   }
}


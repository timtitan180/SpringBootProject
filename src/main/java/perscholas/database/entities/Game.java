package perscholas.database.entities;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="games")
public class Game {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="game_id")
	private Integer gameId;
	@Column(name="game_date")
	private Date game_date;
	@Column(name="location")
	private String location;
	@Column(name="team1")
	private String team1;
	@Column(name="team2")
	private String team2;
	@Column(name="score")
	private String score;
	
	public Integer getGameId() {
		return gameId;
	}
	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}
	public Date getGame_date() {
		return game_date;
	}
	public void setGame_date(Date game_date) {
		this.game_date = game_date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}

}

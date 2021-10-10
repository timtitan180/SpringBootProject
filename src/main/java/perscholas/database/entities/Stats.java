package perscholas.database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stats")
public class Stats {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "player_id")
	private Integer playerId;

	@Column(name = "games")
	private Integer games;

	@Column(name = "atbat")
	private Integer atBats;

	@Column(name = "hits")
	private Integer hits;

	@Column(name = "2B")
	private Integer doubles;

	@Column(name = "3B")
	private Integer triples;

	@Column(name = "homeruns")
	private Integer homeRuns;

	@Column(name = "runsbattedin")
	private Integer runsBattedIn;

	@Column(name = "walks")
	private Integer walks;

	@Column(name = "times_struck_out")
	private Integer timesStruckOut;

	@Column(name = "innings_pitched")
	private Integer inningsPitched;

	@Column(name = "homeruns_allowed")
	private Integer homeRunsAllowed;

	@Column(name = "hits_allowed")
	private Integer hitsAllowed;

	@Column(name = "walks_allowed")
	private Integer walksAllowed;

	@Column(name = "strikeouts")
	private Integer runsAllowed;

	public Integer getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	public Integer getGames() {
		return games;
	}

	public void setGames(Integer games) {
		this.games = games;
	}

	public Integer getAtBats() {
		return atBats;
	}

	public void setAtBats(Integer atBats) {
		this.atBats = atBats;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	public Integer getDoubles() {
		return doubles;
	}

	public void setDoubles(Integer doubles) {
		this.doubles = doubles;
	}

	public Integer getTriples() {
		return triples;
	}

	public void setTriples(Integer triples) {
		this.triples = triples;
	}

	public Integer getHomeRuns() {
		return homeRuns;
	}

	public void setHomeRuns(Integer homeRuns) {
		this.homeRuns = homeRuns;
	}

	public Integer getRunsBattedIn() {
		return runsBattedIn;
	}

	public void setRunsBattedIn(Integer runsBattedIn) {
		this.runsBattedIn = runsBattedIn;
	}

	public Integer getWalks() {
		return walks;
	}

	public void setWalks(Integer walks) {
		this.walks = walks;
	}

	public Integer getTimesStruckOut() {
		return timesStruckOut;
	}

	public void setTimesStruckOut(Integer timesStruckOut) {
		this.timesStruckOut = timesStruckOut;
	}

	public Integer getInningsPitched() {
		return inningsPitched;
	}

	public void setInningsPitched(Integer inningsPitched) {
		this.inningsPitched = inningsPitched;
	}

	public Integer getHomeRunsAllowed() {
		return homeRunsAllowed;
	}

	public void setHomeRunsAllowed(Integer homeRunsAllowed) {
		this.homeRunsAllowed = homeRunsAllowed;
	}

	public Integer getHitsAllowed() {
		return hitsAllowed;
	}

	public void setHitsAllowed(Integer hitsAllowed) {
		this.hitsAllowed = hitsAllowed;
	}

	public Integer getWalksAllowed() {
		return walksAllowed;
	}

	public void setWalksAllowed(Integer walksAllowed) {
		this.walksAllowed = walksAllowed;
	}

	public Integer getRunsAllowed() {
		return runsAllowed;
	}

	public void setRunsAllowed(Integer runsAllowed) {
		this.runsAllowed = runsAllowed;
	}

}

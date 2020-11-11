package com.org.dxc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "TeamPoints_Table")
public class TeamPointsTable {
	
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name = "team_Id")
	private int id;
	@Column(name = "team_name")
	private String teamName;
	@Column(name = "matches_played")
	private int matchesPlayed;
	@Column(name = "matches_won")
	private int matchesWon;
	@Column(name = "matches_lost")
	private int matchesLost;
	@Column(name = "matches_drawn")
	private int matchesDrawn;
	private int points;
	public TeamPointsTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeamPointsTable(int id, String teamName, int matchesPlayed, int matchesWon, int matchesLost,
			int matchesDrawn, int points) {
		super();
		this.id = id;
		this.teamName = teamName;
		this.matchesPlayed = matchesPlayed;
		this.matchesWon = matchesWon;
		this.matchesLost = matchesLost;
		this.matchesDrawn = matchesDrawn;
		this.points = points;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	public int getMatchesWon() {
		return matchesWon;
	}
	public void setMatchesWon(int matchesWon) {
		this.matchesWon = matchesWon;
	}
	public int getMatchesLost() {
		return matchesLost;
	}
	public void setMatchesLost(int matchesLost) {
		this.matchesLost = matchesLost;
	}
	public int getMatchesDrawn() {
		return matchesDrawn;
	}
	public void setMatchesDrawn(int matchesDrawn) {
		this.matchesDrawn = matchesDrawn;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + matchesDrawn;
		result = prime * result + matchesLost;
		result = prime * result + matchesPlayed;
		result = prime * result + matchesWon;
		result = prime * result + points;
		result = prime * result + ((teamName == null) ? 0 : teamName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeamPointsTable other = (TeamPointsTable) obj;
		if (id != other.id)
			return false;
		if (matchesDrawn != other.matchesDrawn)
			return false;
		if (matchesLost != other.matchesLost)
			return false;
		if (matchesPlayed != other.matchesPlayed)
			return false;
		if (matchesWon != other.matchesWon)
			return false;
		if (points != other.points)
			return false;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TeamPointsTable [id=" + id + ", teamName=" + teamName + ", matchesPlayed=" + matchesPlayed
				+ ", matchesWon=" + matchesWon + ", matchesLost=" + matchesLost + ", matchesDrawn=" + matchesDrawn
				+ ", points=" + points + "]";
	}
	

}

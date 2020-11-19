package com.org.dxc.model;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Match_Details")
public class MatchDetails {
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	private int matchId;
	private String teamOne;
	private String teamTwo;
	private Date date;
	private String start_time;
	private String end_time;
	private String stadium;
	private String winner;
	private String status;
	private String delay;
	public MatchDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MatchDetails(int matchId, String teamOne, String teamTwo, Date date, String start_time, String end_time,
			String stadium, String winner, String status, String delay) {
		super();
		this.matchId = matchId;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.date = date;
		this.start_time = start_time;
		this.end_time = end_time;
		this.stadium = stadium;
		this.winner = winner;
		this.status = status;
		this.delay = delay;
	}
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public String getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	public String getTeamTwo() {
		return teamTwo;
	}
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getStadium() {
		return stadium;
	}
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDelay() {
		return delay;
	}
	public void setDelay(String delay) {
		this.delay = delay;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((delay == null) ? 0 : delay.hashCode());
		result = prime * result + ((end_time == null) ? 0 : end_time.hashCode());
		result = prime * result + matchId;
		result = prime * result + ((stadium == null) ? 0 : stadium.hashCode());
		result = prime * result + ((start_time == null) ? 0 : start_time.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((teamOne == null) ? 0 : teamOne.hashCode());
		result = prime * result + ((teamTwo == null) ? 0 : teamTwo.hashCode());
		result = prime * result + ((winner == null) ? 0 : winner.hashCode());
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
		MatchDetails other = (MatchDetails) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (delay == null) {
			if (other.delay != null)
				return false;
		} else if (!delay.equals(other.delay))
			return false;
		if (end_time == null) {
			if (other.end_time != null)
				return false;
		} else if (!end_time.equals(other.end_time))
			return false;
		if (matchId != other.matchId)
			return false;
		if (stadium == null) {
			if (other.stadium != null)
				return false;
		} else if (!stadium.equals(other.stadium))
			return false;
		if (start_time == null) {
			if (other.start_time != null)
				return false;
		} else if (!start_time.equals(other.start_time))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (teamOne == null) {
			if (other.teamOne != null)
				return false;
		} else if (!teamOne.equals(other.teamOne))
			return false;
		if (teamTwo == null) {
			if (other.teamTwo != null)
				return false;
		} else if (!teamTwo.equals(other.teamTwo))
			return false;
		if (winner == null) {
			if (other.winner != null)
				return false;
		} else if (!winner.equals(other.winner))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MatchDetails [matchId=" + matchId + ", teamOne=" + teamOne + ", teamTwo=" + teamTwo + ", date=" + date
				+ ", start_time=" + start_time + ", end_time=" + end_time + ", stadium=" + stadium + ", winner="
				+ winner + ", status=" + status + ", delay=" + delay + "]";
	}
	
	
	
	

}

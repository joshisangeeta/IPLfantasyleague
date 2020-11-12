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
	@Column(name = "start_time")
	private Time startTime;
	@Column(name = "end_time")
	private Time endTime;
	private String stadium;
	private String winner;
	private String status;
	private String delay;
	@OneToOne(cascade = CascadeType.ALL)
	private BiddingDetails bid;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "matchId")
	private List<BiddingDetails> biddingMatchId;
	public MatchDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MatchDetails(int matchId, String teamOne, String teamTwo, Date date, Time startTime, Time endTime,
			String stadium, String winner, String status, String delay, BiddingDetails bid,
			List<BiddingDetails> biddingMatchId) {
		super();
		this.matchId = matchId;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.stadium = stadium;
		this.winner = winner;
		this.status = status;
		this.delay = delay;
		this.bid = bid;
		this.biddingMatchId = biddingMatchId;
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
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public Time getEndTime() {
		return endTime;
	}
	public void setEndTime(Time endTime) {
		this.endTime = endTime;
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
	public BiddingDetails getBid() {
		return bid;
	}
	public void setBid(BiddingDetails bid) {
		this.bid = bid;
	}
	
	public List<BiddingDetails> getBiddingMatchId() {
		return biddingMatchId;
	}

	public void setBiddingMatchId(List<BiddingDetails> biddingMatchId) {
		this.biddingMatchId = biddingMatchId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bid == null) ? 0 : bid.hashCode());
		result = prime * result + ((biddingMatchId == null) ? 0 : biddingMatchId.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((delay == null) ? 0 : delay.hashCode());
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result + matchId;
		result = prime * result + ((stadium == null) ? 0 : stadium.hashCode());
		result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
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
		if (bid == null) {
			if (other.bid != null)
				return false;
		} else if (!bid.equals(other.bid))
			return false;
		if (biddingMatchId == null) {
			if (other.biddingMatchId != null)
				return false;
		} else if (!biddingMatchId.equals(other.biddingMatchId))
			return false;
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
		if (endTime == null) {
			if (other.endTime != null)
				return false;
		} else if (!endTime.equals(other.endTime))
			return false;
		if (matchId != other.matchId)
			return false;
		if (stadium == null) {
			if (other.stadium != null)
				return false;
		} else if (!stadium.equals(other.stadium))
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
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
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", stadium=" + stadium + ", winner=" + winner
				+ ", status=" + status + ", delay=" + delay + ", bid=" + bid + ", biddingMatchId=" + biddingMatchId
				+ "]";
	}

	
	
	
	

}

package com.org.dxc.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Tournament {
	
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	private int tournamentId;
	@Column(name = "number_of_qualifiers")
	private int numberOfQualifier;
	@Column(name = "number_of_teams")
	private int numberOfTeams;
	@Column(name = "number_of_matches_completed")
	private int numberOfMatchesCompleted;
	public Tournament() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tournament(int tournamentId, int numberOfQualifier, int numberOfTeams, int numberOfMatchesCompleted) {
		super();
		this.tournamentId = tournamentId;
		this.numberOfQualifier = numberOfQualifier;
		this.numberOfTeams = numberOfTeams;
		this.numberOfMatchesCompleted = numberOfMatchesCompleted;
	}
	public int getTournamentId() {
		return tournamentId;
	}
	public void setTournamentId(int tournamentId) {
		this.tournamentId = tournamentId;
	}
	public int getNumberOfQualifier() {
		return numberOfQualifier;
	}
	public void setNumberOfQualifier(int numberOfQualifier) {
		this.numberOfQualifier = numberOfQualifier;
	}
	public int getNumberOfTeams() {
		return numberOfTeams;
	}
	public void setNumberOfTeams(int numberOfTeams) {
		this.numberOfTeams = numberOfTeams;
	}
	public int getNumberOfMatchesCompleted() {
		return numberOfMatchesCompleted;
	}
	public void setNumberOfMatchesCompleted(int numberOfMatchesCompleted) {
		this.numberOfMatchesCompleted = numberOfMatchesCompleted;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfMatchesCompleted;
		result = prime * result + numberOfQualifier;
		result = prime * result + numberOfTeams;
		result = prime * result + tournamentId;
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
		Tournament other = (Tournament) obj;
		if (numberOfMatchesCompleted != other.numberOfMatchesCompleted)
			return false;
		if (numberOfQualifier != other.numberOfQualifier)
			return false;
		if (numberOfTeams != other.numberOfTeams)
			return false;
		if (tournamentId != other.tournamentId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Tournament [tournamentId=" + tournamentId + ", numberOfQualifier=" + numberOfQualifier
				+ ", numberOfTeams=" + numberOfTeams + ", numberOfMatchesCompleted=" + numberOfMatchesCompleted + "]";
	}
	

}

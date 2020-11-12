package com.org.dxc.model;

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
	@Column(name = "tournament_Id")
	private int id;
	@Column(name = "number_of_qualifiers")
	private int numberOfQualifier;
	@Column(name = "number_of_teams")
	private int numberOfTeams;
	@Column(name = "number_of_matches_completed")
	private int numberOfMatchesCompleted;
	@Column(name = "match_id")
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "id")
	private MatchDetails matchId;

}

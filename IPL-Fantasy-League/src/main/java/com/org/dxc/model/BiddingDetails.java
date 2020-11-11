package com.org.dxc.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Bidding_Details")
public class BiddingDetails {
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name = "user_Id")
	private int id;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "id")
	private MatchSchedule matchId;
	private String opinion;

}

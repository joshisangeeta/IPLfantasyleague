package com.org.dxc.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Match_Schedule")
public class MatchSchedule {
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name = "match_Id")
	private int id;
	@Column(name = "team_one_id")
	private int teamOneId;
	@Column(name = "team_two_id")
	private int teamTwoId;
	@Column(name = "match_date")
	private Date matchDate;
	@Column(name = "start_time")
	private Time startTime;
	@Column(name = "end_time")
	private Time endTime;
	private String result;

}

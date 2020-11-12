package com.org.dxc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dxc.dao.AdminRepository;
import com.org.dxc.dao.BidderRepository;
import com.org.dxc.dao.BiddingDetailsRepository;
import com.org.dxc.dao.LeaderboardRepository;
import com.org.dxc.dao.MatchDetailsRepository;
import com.org.dxc.dao.TeamDetailsRepository;
import com.org.dxc.dao.TournamentRepository;

@Service
public class IPLServiceImp implements IPLService {
	
@Autowired
AdminRepository admin;

@Autowired
BidderRepository bidder;

@Autowired
BiddingDetailsRepository biddingDetails;

@Autowired
LeaderboardRepository leaderboardRepository;

@Autowired
MatchDetailsRepository matchDetails;

@Autowired
TeamDetailsRepository teamDetails;

@Autowired
TournamentRepository tournament;

}

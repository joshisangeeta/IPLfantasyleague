package com.org.dxc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.dxc.model.BiddingDetails;
@Repository
public interface BiddingDetailsRepository extends JpaRepository<BiddingDetails, Integer> {

}

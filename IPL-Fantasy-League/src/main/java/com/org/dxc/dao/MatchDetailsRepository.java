package com.org.dxc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.dxc.model.MatchDetails;
@Repository
public interface MatchDetailsRepository extends JpaRepository<MatchDetails, Integer> {

}

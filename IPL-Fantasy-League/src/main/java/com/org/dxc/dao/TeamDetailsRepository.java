package com.org.dxc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.org.dxc.model.Admin;
import com.org.dxc.model.TeamDetails;
@Repository
public interface TeamDetailsRepository extends JpaRepository<TeamDetails, Integer> {

	@Query(value="select * from Team_Details td where td.name=?1",nativeQuery = true)
	public TeamDetails getTeamDetailsByName(String name);
	
	@Query(value="select * from Team_Details td order by ranking asc",nativeQuery = true)
	public List<TeamDetails> getPointsTable();
	
}

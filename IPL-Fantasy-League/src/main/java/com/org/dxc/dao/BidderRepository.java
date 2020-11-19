package com.org.dxc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.org.dxc.model.Bidder;
@Repository
public interface BidderRepository extends JpaRepository<Bidder, Integer> {
	
	@Query(value = "select * from bidder bd where bd.email=?1 and bd.password=?2",nativeQuery = true)
	public Bidder getBidderByEmailAndPassword(String email,String password);
	
	@Query(value = "select * from bidder bd where bd.email=?1",nativeQuery = true)
	public Bidder getBidderByEmail(String email);

}

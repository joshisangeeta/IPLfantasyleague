package com.org.dxc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.dxc.model.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

}

package com.youtube.jwt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.youtube.jwt.entity.Deals;
@Repository
public interface DealsDao extends JpaRepository<Deals, Long> {

}

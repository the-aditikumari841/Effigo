package com.learningportal.learningportalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learningportal.learningportalproject.entity.FavEntity;


@Repository
public interface FavRepository extends JpaRepository<FavEntity, Long> {

}

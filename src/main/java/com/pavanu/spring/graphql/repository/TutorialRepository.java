package com.pavanu.spring.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavanu.spring.graphql.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}

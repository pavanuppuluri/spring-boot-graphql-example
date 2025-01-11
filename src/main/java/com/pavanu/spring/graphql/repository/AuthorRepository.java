package com.pavanu.spring.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavanu.spring.graphql.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
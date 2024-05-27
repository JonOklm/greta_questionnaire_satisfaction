package com.example.greta_questionnaire_satisfaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.greta_questionnaire_satisfaction.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

package com.covidcare.CovidCare.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covidcare.CovidCare.model.Feedback;

public interface FeedbackRepo extends JpaRepository<Feedback, String> {

}

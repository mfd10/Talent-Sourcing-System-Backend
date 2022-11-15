package com.peoplist.Talent.Sourcing.System.repository;

import com.peoplist.Talent.Sourcing.System.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate,Integer> {

}

package com.peoplist.Talent.Sourcing.System.repository;

import com.peoplist.Talent.Sourcing.System.model.CandidateInteraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CandidateInteractionRepository extends JpaRepository<CandidateInteraction, Integer> {

    Optional<List<CandidateInteraction>> findByCandidateId(Integer id);
}

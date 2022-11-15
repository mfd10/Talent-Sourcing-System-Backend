package com.peoplist.Talent.Sourcing.System.service;

import com.peoplist.Talent.Sourcing.System.model.Candidate;

import java.util.List;


public interface ICandidateService {
     Candidate saveCandidate(Candidate candidate);
     List<Candidate> getAllCandidates();
}

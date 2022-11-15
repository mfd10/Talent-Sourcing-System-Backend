package com.peoplist.Talent.Sourcing.System.controller;

import com.peoplist.Talent.Sourcing.System.exception.ResourceNotFoundException;
import com.peoplist.Talent.Sourcing.System.model.Candidate;
import com.peoplist.Talent.Sourcing.System.repository.CandidateRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidates")
@CrossOrigin
public class CandidateController {

    private final CandidateRepository candidateRepository;

    public CandidateController(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @PostMapping
    public String addCandidate(@RequestBody Candidate candidate) {
        candidateRepository.save(candidate);
        return "New Candidate is added";
    }

    @GetMapping
    public List<Candidate> getCandidates() {
        return candidateRepository.findAll();
    }

    @GetMapping("{id}")
    Candidate getCandidateById(@PathVariable Integer id) {
        return candidateRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id,"candidate"));
    }

    @PutMapping("{id}")
    Candidate updateUser(@RequestBody Candidate newCandidate, @PathVariable Integer id) {
        return candidateRepository.findById(id)
                .map(candidate -> {
                    candidate.setName(newCandidate.getName());
                    candidate.setCandidateInteraction(newCandidate.getCandidateInteraction());
                    candidate.setContactInformation(newCandidate.getContactInformation());
                    candidate.setStatus(newCandidate.getStatus());
                    return candidateRepository.save(candidate);
                }).orElseThrow(() -> new ResourceNotFoundException(id,"candidate"));
    }

    @DeleteMapping("{id}")
    String deleteUser(@PathVariable Integer id) {
        if (!candidateRepository.existsById(id)) {
            throw new ResourceNotFoundException(id,"candidate");
        }
        candidateRepository.deleteById(id);
        return "User with id " + id + " has been deleted success.";
    }
}


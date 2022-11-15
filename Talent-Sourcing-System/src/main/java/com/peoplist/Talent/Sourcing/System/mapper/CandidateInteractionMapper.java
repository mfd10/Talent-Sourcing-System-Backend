package com.peoplist.Talent.Sourcing.System.mapper;

import com.peoplist.Talent.Sourcing.System.dto.CandidateInteractionPostDTO;
import com.peoplist.Talent.Sourcing.System.exception.ResourceNotFoundException;
import com.peoplist.Talent.Sourcing.System.model.Candidate;
import com.peoplist.Talent.Sourcing.System.model.CandidateInteraction;
import com.peoplist.Talent.Sourcing.System.repository.CandidateRepository;
import org.springframework.stereotype.Component;

@Component
public class CandidateInteractionMapper {

    private final CandidateRepository candidateRepository;

    public CandidateInteractionMapper(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public  CandidateInteraction mapDtoToInteraction(CandidateInteractionPostDTO dto) {
        CandidateInteraction interaction = new CandidateInteraction();
        Candidate candidate = candidateRepository.findById(dto.getCandidateId()).orElseThrow(
                () -> new ResourceNotFoundException(dto.getCandidateId(), "candidate")
        );
        interaction.setType(dto.getType());
        interaction.setCandidate(candidate);
        interaction.setDate(dto.getDate());
        interaction.setCandidateResponded(dto.getCandidateResponded());
        interaction.setContent(dto.getContent());
        interaction.setId(dto.getId());
        return interaction;
    }

}

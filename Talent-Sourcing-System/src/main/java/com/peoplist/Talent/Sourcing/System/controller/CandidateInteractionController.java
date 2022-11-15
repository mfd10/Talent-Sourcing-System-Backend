package com.peoplist.Talent.Sourcing.System.controller;

import com.peoplist.Talent.Sourcing.System.dto.CandidateInteractionPostDTO;
import com.peoplist.Talent.Sourcing.System.exception.ResourceNotFoundException;
import com.peoplist.Talent.Sourcing.System.mapper.CandidateInteractionMapper;
import com.peoplist.Talent.Sourcing.System.model.Candidate;
import com.peoplist.Talent.Sourcing.System.model.CandidateInteraction;
import com.peoplist.Talent.Sourcing.System.repository.CandidateInteractionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/interactions")
@CrossOrigin
public class CandidateInteractionController {


    private final CandidateInteractionRepository repository;
    private final CandidateInteractionMapper interactionMapper;

    public CandidateInteractionController(CandidateInteractionRepository repository,
                                          CandidateInteractionMapper interactionMapper) {
        this.repository = repository;
        this.interactionMapper = interactionMapper;
    }


    @PostMapping
    public String addCandidate(@RequestBody CandidateInteractionPostDTO dto) {

        repository.save(interactionMapper.mapDtoToInteraction(dto));
        return "New Candidate interaction is added";
    }

    @GetMapping
    List<CandidateInteraction> getCandidateInteractionById(@RequestParam("candidateId") Integer id) {

        return repository.findByCandidateId(id).orElseThrow(
                () -> new ResourceNotFoundException(id, "candidate interactions")
        );
    }

    @GetMapping("{id}")
    CandidateInteraction getCandidateById(@PathVariable Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id,"candidate"));
    }

    @PutMapping("{id}")
    CandidateInteraction updateUser(@RequestBody CandidateInteractionPostDTO dto, @PathVariable Integer id) {

        CandidateInteraction interaction = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException(id, "candidate interaction")
        );

        CandidateInteraction newInteraction =interactionMapper.mapDtoToInteraction(dto);

        interaction.setCandidate(newInteraction.getCandidate());
        interaction.setContent(newInteraction.getContent());
        interaction.setDate(newInteraction.getDate());
        interaction.setType(newInteraction.getType());
        interaction.setCandidateResponded(newInteraction.getCandidateResponded());

        return repository.save(interaction);
    }

    @DeleteMapping("{id}")
    String deleteUser(@PathVariable Integer id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException(id, "candidate interaction");
        }
        repository.deleteById(id);
        return "Candidate interaction with id= " + id + " has been deleted success.";
    }


}

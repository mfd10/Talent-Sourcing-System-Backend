package com.peoplist.Talent.Sourcing.System.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "candidate ")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String contactInformation;
    @OneToMany(mappedBy = "candidate")
    @JsonIgnore
    private List<CandidateInteraction> candidateInteraction;
    private Status status;

    public Candidate() {
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public List<CandidateInteraction> getCandidateInteraction() {
        return candidateInteraction;
    }

    public void setCandidateInteraction(List<CandidateInteraction> candidateInteraction) {
        this.candidateInteraction = candidateInteraction;
    }
}

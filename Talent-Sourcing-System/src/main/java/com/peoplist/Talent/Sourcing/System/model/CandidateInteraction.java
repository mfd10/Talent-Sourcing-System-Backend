package com.peoplist.Talent.Sourcing.System.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CandidateInteraction")
public class CandidateInteraction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private boolean candidateResponded;
    private String content;
    private Date date;
    private Type type;
    @ManyToOne
    @JoinColumn(nullable = false, name = "candidate_id")
    private Candidate candidate;

    public CandidateInteraction() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getCandidateResponded() {
        return candidateResponded;
    }

    public void setCandidateResponded(boolean candidateResponded) {
        this.candidateResponded = candidateResponded;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }
}


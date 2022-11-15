package com.peoplist.Talent.Sourcing.System.dto;

import com.peoplist.Talent.Sourcing.System.model.Type;

import java.util.Date;

public class CandidateInteractionPostDTO {

    private int id;
    private boolean candidateResponded;
    private String content;
    private Date date;
    private Type type;
    private int candidateId;


    public CandidateInteractionPostDTO(int id, boolean candidateResponded, String content, Date date, Type type, int candidateId) {
        this.id = id;
        this.candidateResponded = candidateResponded;
        this.content = content;
        this.date = date;
        this.type = type;
        this.candidateId = candidateId;
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

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }
}

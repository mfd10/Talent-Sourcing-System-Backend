package com.peoplist.Talent.Sourcing.System.model;

public enum Status {
    SOURCED("Sourced"),
    INTERVIEWING("Interviewing"),
    OFFER_SEND("Offer Send"),
    HIRED("Hired");


    private final String status;

    Status(String status) {
        this.status = status;
    }
}

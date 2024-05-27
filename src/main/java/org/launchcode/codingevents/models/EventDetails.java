package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.*;

@Entity
public class EventDetails extends AbstractEntity {


    @Size(max = 500, message = "Description too long!")
    private String description;


    @Email
    @NotBlank(message = "email is required")
    private String contactEmail;


    @Size(min = 3, max = 50, message = "Location must be between 3 and 50 characters!")
    @NotBlank
    private String location;

    @AssertTrue
    private Boolean rsvp;

    @Positive(message="Number of attendees must be one or more.")
    private int numberOfAttendees;


    public EventDetails(String description, String contactEmail, String location, Boolean rsvp, int numberOfAttendees) {
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.rsvp = rsvp;
        this.numberOfAttendees = numberOfAttendees;
    }

    public EventDetails() {}

    public @Size(max = 500, message = "Description too long!") String getDescription() {
        return description;
    }

    public void setDescription(@Size(max = 500, message = "Description too long!") String description) {
        this.description = description;
    }

    public @Email @NotBlank(message = "email is required") String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(@Email @NotBlank(message = "email is required") String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public @Size(min = 3, max = 50, message = "Location must be between 3 and 50 characters!") @NotBlank String getLocation() {
        return location;
    }

    public void setLocation(@Size(min = 3, max = 50, message = "Location must be between 3 and 50 characters!") @NotBlank String location) {
        this.location = location;
    }

    public @AssertTrue Boolean getRsvp() {
        return rsvp;
    }

    public void setRsvp(@AssertTrue Boolean rsvp) {
        this.rsvp = rsvp;
    }

    @Positive(message = "Number of attendees must be one or more.")
    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(@Positive(message = "Number of attendees must be one or more.") int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }
}


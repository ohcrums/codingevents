package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.*;

@Entity
public class Event extends AbstractEntity {

    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters!")
    @NotBlank
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @Size(min = 3, max = 50, message = "Location must be between 3 and 50 characters!")
    @NotBlank
    private String location;

    private EventType type;

    @Email
    @NotBlank(message = "email is required")
    private String contactEmail;

    @AssertTrue
    private Boolean rsvp;

    @Positive(message="Number of attendees must be one or more.")
    private int numberOfAttendees;


    public Event() {}

    public Event(String name, String description, String location, String contactEmail, Boolean rsvp, int numberOfAttendees, EventType type) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.contactEmail = contactEmail;
        this.rsvp = rsvp;
        this.numberOfAttendees = numberOfAttendees;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public @Email String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(@Email String contactEmail) {
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

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    @Positive(message = "Number of attendees must be one or more.")
    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(@Positive(message = "Number of attendees must be one or more.") int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    @Override
    public String toString() {
        return name;
    }

}

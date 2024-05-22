package org.launchcode.codingevents.models;

import jakarta.validation.constraints.*;

import java.util.Objects;


public class Event {
    private int id;
    private static int nextId = 1;

    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters!")
    @NotBlank
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @Email
    @NotBlank(message = "email is required")
    private String contactEmail;


    public Event() {
        this.id = nextId;
        nextId ++;
    }

    public Event(String name, String description, String contactEmail) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
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

    public int getId() {
        return id;
    }

    public @Email String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(@Email String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

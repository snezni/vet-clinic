package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

class Dog {
    private String name;
    private String breed;
    private LocalDateTime birthday;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setBreed(String breed) {
        this.breed = breed;
    }

    String getBreed() {
        return breed;
    }

    void setDateOfBirth(LocalDateTime birthday) {
        this.birthday = birthday;

    }

    LocalDateTime getDateBirth() {
        return birthday;
    }
}

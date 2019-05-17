package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class Wolf {
    private final String name;
    private final String breed;
    private final LocalDateTime birthday;

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public Wolf(String name, String breed, LocalDateTime birthday) {
        this.name = name;
        this.breed = breed;
        this.birthday = birthday;
    }

    public static WolfBuilder called(String name){
        return new WolfBuilder(name);
    }

    public static class WolfBuilder {
        String name;
        String breed;
        LocalDateTime birthday;

        public WolfBuilder(String name){
            this.name = name;
        }
        public WolfBuilder ofBreed(String breed){
            this.breed = breed;
            return this;
        }
        public Wolf dateOfBirth(LocalDateTime birthday){
            return new Wolf(name,breed,birthday);
        }


    }
}

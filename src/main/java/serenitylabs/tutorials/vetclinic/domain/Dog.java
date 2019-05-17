package serenitylabs.tutorials.vetclinic.domain;
import java.time.LocalDateTime;

public class Dog {
    private final String name;
    private final LocalDateTime dateOfBirth;
    private final String breed;

    public Dog(String name, String breed, LocalDateTime dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.breed = breed;
    }

    public static DogBuilder called(String name) {
        return new DogBuilder(name);
    }

    public String getName() {
        return name;
    }

    public static class DogBuilder {
        private String name;
        private String breed;
        private  LocalDateTime birthday ;
        public DogBuilder(String name){
        this.name = name;
        }

        public DogBuilder ofBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public Dog bornOn(LocalDateTime birthday) {
           return new Dog(name,breed,birthday);
        }
    }
}

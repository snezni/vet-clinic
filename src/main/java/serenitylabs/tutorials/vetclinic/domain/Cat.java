package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;
import java.util.Date;

public class Cat {
private String name;
private String breed;
private LocalDateTime birthday;
    public Cat(String name, String breed, LocalDateTime birthday) {
        this.name = name;
        this.breed = breed;
        this.birthday = birthday;
    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public LocalDateTime getBirthday() {
        return birthday;
    }
    public static CatBuilder called(String name){
        return new CatBuilder(name);
    }


    public static class CatBuilder {
        private String name;
        private String breed;
        private LocalDateTime birthday;

        public CatBuilder(String name){
            this.name = name;
        }
        public CatBuilder ofBreed(String breed){
            this.breed = breed;
            return this;
        }
        public Cat  bornOn(LocalDateTime birthday){
            return new Cat(name,breed,birthday);
        }

    }
}

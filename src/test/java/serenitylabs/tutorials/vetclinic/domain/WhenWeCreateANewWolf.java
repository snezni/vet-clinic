package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class WhenWeCreateANewWolf {
    LocalDateTime birthday = LocalDateTime.now();
    Wolf wolf =  Wolf.called("IronWolf").ofBreed("AlaskaWolf").dateOfBirth(birthday);



}

package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class WhenCreatingANewDog {
    @Test
    public void it_should_have_a_name() {
        Dog fido = new Dog();
        LocalDateTime birthday = LocalDateTime.now();
        fido.setName("Fido");
        fido.setBreed("Poodle");
        fido.setDateOfBirth(birthday);


        Assert.assertEquals("Fido",fido.getName());
        Assert.assertEquals("Poodle",fido.getBreed());
        Assert.assertEquals(birthday,fido.getDateBirth());

    }
}

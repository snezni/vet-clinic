package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class WhenWeCreateANewCat {
    LocalDateTime birthday = LocalDateTime.now();


    @Test
    public void a_new_cat_should_have_a_name() {
        Cat cat = Cat.called("Daca").ofBreed("UlicnaMaca").bornOn(birthday);
        Assert.assertEquals("Daca",cat.getName());
        Assert.assertEquals("UlicnaMaca", cat.getBreed());
        Assert.assertEquals(birthday,cat.getBirthday());
    }
}

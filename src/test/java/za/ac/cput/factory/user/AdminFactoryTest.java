package za.ac.cput.factory.user;

import org.junit.Assert;
import za.ac.cput.domain.user.Admin;

import static org.junit.Assert.*;

public class AdminFactoryTest {

   private String email,fname,lname;

    @org.junit.Before
    public void setUp() throws Exception {

       email ="cyfotyasi@gmail.com ";
       fname="Siphokuhle";
       lname="Tyasi";
    }

    @org.junit.Test
    public void generateBuilder() {

       Admin admin=AdminFactory.GenerateBuilder(email,fname,lname);
       System.out.println(admin);
        Assert.assertNotNull(admin);


    }
}
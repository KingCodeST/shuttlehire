package za.ac.cput.factory.user;

import za.ac.cput.domain.user.Admin;

public class AdminFactory {

    public static Admin GenerateBuilder(String email,String lname,String fname)
    {
        return new Admin.Builder()
                                .setEmail(email)
                                .setFname(lname)
                                .setLname(fname)
                                .build();
    }


}

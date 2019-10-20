package za.ac.cput.domain.util;

import java.util.UUID;

public class Misc {
    public static String generatedId(){
        return UUID.randomUUID().toString();
    }

}

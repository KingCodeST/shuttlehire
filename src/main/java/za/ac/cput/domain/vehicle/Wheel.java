package za.ac.cput.domain.vehicle;

public class Wheel {

   private String typename;
   private String id;


   private Wheel(){}

    public Wheel(String typename, String id) {
        this.typename = typename;
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "typename='" + typename + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

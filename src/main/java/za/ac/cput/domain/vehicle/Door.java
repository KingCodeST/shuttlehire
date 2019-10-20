package za.ac.cput.domain.vehicle;

import javax.persistence.Entity;

@Entity
public class Door {

    private String typename;
    private int size;

    private Door(){}

    public Door(String typename, int size) {
        this.typename = typename;
        this.size = size;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Door{" +
                "typename='" + typename + '\'' +
                ", size=" + size +
                '}';
    }
}

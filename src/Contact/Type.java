package Contact;

import java.io.Serializable;

public class Type implements Serializable {
    public int id ;
    public String name;

    public Type() {
            this.id=1;
            this.name= "family";
    }

    public Type(int id, String name) {
        this.id = id;
        this.name = name;
    }




    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }


}

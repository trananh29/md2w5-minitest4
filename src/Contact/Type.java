package Contact;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

public class Type implements Serializable {
    public int id ;
    public String name;
    HashMap <String, Integer> typeHashMap = new HashMap<>();

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

    public int compareTo(Type type) {
        return this.compareTo(type);
    }
    public Type input(){
        Scanner sci= new Scanner(System.in);
        System.out.println("input id: ");
        int id= sci.nextInt();
        Scanner sci2= new Scanner(System.in);
        System.out.println("input type name: ");
        String name= sci2.nextLine();
        Type type= new Type(id, name);
        typeHashMap.put(name, id);
        return type;

    }




}

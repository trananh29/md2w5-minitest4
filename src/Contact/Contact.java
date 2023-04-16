package Contact;

import java.io.Serializable;
import java.util.Scanner;

public class Contact implements Serializable{
    protected String name;
    protected String phoneNumber;
    protected Type type;


    public Contact() {
        this.name="Anh";
        this.phoneNumber="0123";
        this.type= new Type(0, "Family");
    }


    public Contact(String name, String phoneNumber, Type type) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            ", type='" + getType() + "'" +
            "}";
    }
    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ten: "); 
        this.name = sc.nextLine();
        this.phoneNumber= sc.nextLine();
        this.type=type.input();
    }

}

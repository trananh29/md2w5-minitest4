package PhoneBookManager;

import java.util.ArrayList;
import java.util.List;

import Contact.Contact;
import Contact.Type;
import Phone.Iphone;
import Phone.Phone;

public class PhoneBookManager extends Phone implements Iphone{
    public List<Contact> contaclist = new ArrayList<>();
    

    public PhoneBookManager() {
        this.contaclist= new ArrayList<>();
    }

    public PhoneBookManager(List<Contact> contaclist) {
        this.contaclist = contaclist;
    }



    @Override
    public void searchIphone(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchIphone'");
    }

    @Override
    public void sortIphone() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortIphone'");
    }

    @Override
    public void display(Type type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'display'");
    }

    @Override
    public void insertPhone(Contact contact) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertPhone'");
    }

    @Override
    public void removePhone(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removePhone'");
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePhone'");
    }


    
    
}

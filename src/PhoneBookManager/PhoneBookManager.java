package PhoneBookManager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import Contact.Contact;
import Contact.Type;
import Phone.Iphone;
import Phone.Phone;
import ReadWriteFile.ReadWriteFile;

public class PhoneBookManager extends Phone implements Iphone{
    public List<Contact> contaclist = new ArrayList<>();
    

    public PhoneBookManager() {
        this.contaclist= new ArrayList<>();
    }

    public PhoneBookManager(List<Contact> contaclist) {
        this.contaclist = contaclist;
    }



    @Override
    public Contact searchIphone(String name) {
       List<Contact> contaclist1 = ReadWriteFile.readFile();
        for (int i=0;i<contaclist1.size();i++) {
            if (name == contaclist1.get(i).getName()) {
                System.out.println("Phone is found");
                return contaclist1.get(i);
            }
        }
        System.out.println("Phone is not found");
        return null;
    }

    @Override
    public void sortIphone() {
     List<Contact> contaclist1 = ReadWriteFile.readFile();
      contaclist1.sort(new Comparator<Contact>() {

        @Override
        public int compare(Contact o1, Contact o2) {
            return o1.getName().compareTo(o2.getName());
        }
        
      });
    }

    @Override
    public void display(Type type) {
        List<Contact> contaclist1 = ReadWriteFile.readFile();
        List<Contact> typeContacts= new ArrayList<>();
        if(type!=null) {

         for (int i=0; i< contaclist1.size();i++){
            if (type== contaclist1.get(i).getType()){
                typeContacts.add(contaclist1.get(i));
            }
         }
         for (int j=0;j<typeContacts.size();j++){
            System.out.println(typeContacts.get(j)+ "\n");
         } }
         else {
            contaclist1.sort(new Comparator<Contact>() {

                @Override
                public int compare(Contact o1, Contact o2) {
                  return o1.getType().getName().compareToIgnoreCase(o2.getType().getName());
                }
                
            });
            
            for (int j=0;j<contaclist1.size();j++){
                System.out.println(contaclist1.get(j)+ "\n");
             } 
         }

    }

    @Override
    public void insertPhone(Contact contact) {
        List<Contact> contaclist1 = ReadWriteFile.readFile();
       contaclist1.add(contact);
       ReadWriteFile.WriteFile(contaclist1);
    }

    @Override
    public void removePhone(String name) {
        List<Contact> contaclist1 = ReadWriteFile.readFile();
        int index=0;
        boolean check = false;
        for (int i=0; i<contaclist1.size();i++){
            if (name == contaclist1.get(i).getName()){
                index=i;
                // System.out.println(" Da tim thay ten can xoa");
                check= true;
            }
        } contaclist1.remove(index);
        if (check) {System.out.println(" Da tim thay ten can xoa\n");}
        else {System.out.println(" KO tim thay ten can xoa\n");}
        ReadWriteFile.WriteFile(contaclist1);
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        
    }
    public int getIndexByName(String name) {

        int index=-1;
        for (Contact contact : contaclist) {
            if (contact.getName().equals(name)) {
               index = contaclist.indexOf(contact);
            }
            
        } return index;
    }

    
    public static void main(String[] args) {
        PhoneBookManager pbm= new PhoneBookManager();
    //    pbm.insertPhone(new Contact("Anh", "0123", new Type(1,"Anh")));
    //    pbm.insertPhone(new Contact("Anh", "0123", new Type(1,"Em")));
    //    pbm.insertPhone(new Contact("Anh", "0123", new Type(1,"Bac")));
    //    pbm.insertPhone(new Contact("Anh", "0123", new Type(1,"Sort")));

    
        pbm.display(null);




   
    }
}

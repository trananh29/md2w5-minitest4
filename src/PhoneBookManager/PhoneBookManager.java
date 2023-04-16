package PhoneBookManager;

import java.util.ArrayList;
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
                  return o1.getType().compareTo(o2.getType());
                }
                
            });
            for (int j=0;j<contaclist1.size();j++){
                System.out.println(contaclist1.get(j)+ "\n");
             } 
         }

    }

    @Override
    public void insertPhone(Contact contact) {
       contaclist.add(contact);
       ReadWriteFile.WriteFile(contaclist);
    }

    @Override
    public void removePhone(String name) {
        int index=0;
        for (int i=0; i<contaclist.size();i++){
            if (name == contaclist.get(i).getName()){
                index=i;
                System.out.println(" Da tim thay ten can xoa");
            }
        } contaclist.remove(index);
        ReadWriteFile.WriteFile(contaclist);
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        
    }


    
    public static void main(String[] args) {
        PhoneBookManager pbm= new PhoneBookManager();
        Contact px1= new Contact();

        pbm.insertPhone(px1);
        pbm.display(null);
        pbm.removePhone("Anh");
        pbm.display(null);
       
    }
}

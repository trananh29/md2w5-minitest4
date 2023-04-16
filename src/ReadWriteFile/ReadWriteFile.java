package ReadWriteFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Contact.Contact;
import Contact.Type;

public class ReadWriteFile {
    public static void WriteFile(List<Contact> contaclist) {
            File file = new File("./storage/listContact.dat");
            try {
                OutputStream os= new FileOutputStream(file);
                ObjectOutputStream oss = new ObjectOutputStream(os);
                oss.writeObject(contaclist);
                oss.close();
                os.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    
}
public static List<Contact> readFile(){
        File file = new File("./storage/listContact.dat");
        List<Contact> contactslist1= new ArrayList<>();
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream fis= new ObjectInputStream(is);
            contactslist1 = (List<Contact>) fis.readObject();
            is.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
return contactslist1;
}
public static void main(String[] args) {
    Contact newcontac1 = new Contact();
    List<Contact> contactslist1= new ArrayList<>();
    contactslist1.add(newcontac1);
    ReadWriteFile.WriteFile(contactslist1);
  List<Contact> c1= ReadWriteFile.readFile();
  System.out.println(c1);

}
}

package arrays.phone;

import java.util.ArrayList;

public class MobilePhone {
    private String MyNumber;
    private ArrayList<Contact> MyContact;

    public MobilePhone(String MyNumber) {
        this.MyNumber = MyNumber;
        this.MyContact = new ArrayList<Contact>();
    }
    //save new contact to phone
    public boolean addNewContact(Contact contact){
        if (findContact(contact.getName()) >=0){
            System.out.println("Contact already exist");
            return false;
        }
        MyContact.add(contact);
        return true;
    }
    // update you contacts
    public boolean updateContact(Contact oldContact,Contact newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition<0){
            System.out.println(oldContact.getName()+"number was not found");
            return false;
        }
        this.MyContact.set(foundPosition,newContact);
        System.out.println(oldContact.getName()+"replace with new contact"+ newContact);
        return true;
    }
    private int findContact(Contact contact){
        return this.MyNumber.indexOf(String.valueOf(contact));
    }
    private int findContact(String contactName){
        for (int i =0; i<this.MyContact.size();i++){
            Contact contact = this.MyContact.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
}

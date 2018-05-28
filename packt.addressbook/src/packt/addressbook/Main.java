package packt.addressbook;

import packt.contact.model.Contact;
import packt.contact.util.ContactLoadException;
import packt.contact.util.ContactLoader;
import packt.util.SortUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args){

        logger.info("Address book viewer application : Started");

        ContactLoader contactLoader = new ContactLoader();
        SortUtil sortUtil = new SortUtil();
        List<Contact> contacts = new ArrayList<>();
        try{
            contacts = contactLoader.loadContacts("./input.xml");
        }catch(ContactLoadException e){
            logger.severe(e.getMessage());
            System.exit(0);
        }
        sortUtil.sortList(contacts);
        System.out.println(contacts);

        logger.info("Address book viewer application : Completed");
    }
}

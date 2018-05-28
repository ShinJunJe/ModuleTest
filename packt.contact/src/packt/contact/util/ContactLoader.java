package packt.contact.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import packt.contact.internal.XmlUtil;
import packt.contact.model.Address;
import packt.contact.model.Contact;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ContactLoader {

    public List<Contact> loadContacts(String fileName) throws
            ContactLoadException{
        XmlUtil xmlUtil = new XmlUtil();
        Document doc;
        List<Contact> contacts = new ArrayList<Contact>();

        try{
            doc = xmlUtil.loadXmlFile(fileName);
        } catch (ParserConfigurationException | SAXException | IOException e ) {
            throw new ContactLoadException("Unable to load Contact file");
        }

        NodeList nList = doc.getElementsByTagName("contact");

        for(int temp=0; temp<nList.getLength(); temp++){
            Node nNode = nList.item(temp);
            String firstName = xmlUtil.getElement(nNode, "firstName");
            String lastName = xmlUtil.getElement(nNode, "lastName");
            String phoneNumber = xmlUtil.getElement(nNode, "phone");
            String street = xmlUtil.getElement(nNode, "street");
            String city = xmlUtil.getElement(nNode, "city");
            String state = xmlUtil.getElement(nNode, "state");
            String country = xmlUtil.getElement(nNode, "country");
            contacts.add(new Contact(firstName, lastName, phoneNumber, new Address(street, city, state, country)));
        }

        return contacts;
    }
}

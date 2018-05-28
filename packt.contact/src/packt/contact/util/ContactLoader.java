package packt.contact.util;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import packt.contact.internal.XmlUtil;
import packt.contact.model.Contact;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public class ContactLoader {

    public List<Contact> loadContacts(String fileName) throws
            ContactLoadException{
        XmlUtil xmlUtil = new XmlUtil();
        Document doc;

        try{
            doc = xmlUtil.loadXmlFile(fileName);

        } catch (ParserConfigurationException | SAXException | IOException e ) {
            throw new ContactLoadException("Unable to load Contact file");
        }
    }
}

package packt.addressbook;

import packt.util.SortUtil;

import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args){

        logger.info("Address book viewer application : Started");

        SortUtil sortUtil = new SortUtil();

        //sortUtil.sortList(contacts);
        //System.out.println(contacts);

        logger.info("Address book viewer application : Completed");
    }
}

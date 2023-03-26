package com.setC;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

       IFlight f2=new IFlight();
       Flight f1=new Flight();


       f2.readIFlight();
       f2.Addticket();
       f2.finalize_flight();

       f1.readFlight();
       f1.addTicket();
       f1.finalize_flight();





    }
}

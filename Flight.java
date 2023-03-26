package com.setC;

import java.util.ArrayList;
import java.util.Scanner;

public class Flight
{

    private  String flicode;
    private  String pcode;
    private  String startcode;
    private  String destcode;
    private  String date;
    private ArrayList<Flight> tickets=new ArrayList<>();


    public Flight()
    {
        flicode="";
        pcode="";
        startcode="";
        destcode="";
        date="";
        this.tickets=new ArrayList<>();
    }
    public Flight(String f,String p,String s,String d,String date)
    {
       flicode=f;
       pcode=p;
       startcode=s;
       destcode=d;
       this.date=date;

    }


    public void setFlicode(String flicode) {
        this.flicode = flicode;
    }

    public String getFlicode() {
        return flicode;
    }


    public void setPcode(String pcode) {
        this.pcode = pcode;
    }


    public String getPcode() {
        return pcode;
    }


    public void setStartcode(String startcode) {
        this.startcode = startcode;
    }

    public String getStartcode() {
        return startcode;
    }

    public void setDestcode(String destcode) {
        this.destcode = destcode;
    }

    public String getDestcode() {
        return destcode;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }


      public void readFlight() throws Exception {

          Scanner input = new Scanner(System.in);
          String date2 = "01062021";//DAY:01 MONTH:06 YEAR:2021
          System.out.println("Give your flight code:");
          flicode = input.next();
          System.out.println("Give the plane's code:");
          pcode = input.next();
          System.out.println("Give the starting point of your flight");
          setStartcode(input.next());
          System.out.println("Give the destination of your flight:");
          setDestcode(input.next());
          System.out.println("Give the date of your flight:");
          date = input.next();

              try {

                  if (date.compareTo(date2) < 0) {
                      System.out.println("Date is before date2");
                      throw new RuntimeException("You gave wrong date!");

                  }

              } catch (RuntimeException e1) {
                  System.out.println(e1.getMessage());
                 System.out.println("Renter your flight's date:");
                  date = input.next();
              }


      }

       public  void addTicket()
       {
           Boolean continueLoop=true;
           Flight f1=new Flight();
           String flightcode;
           String stacode;
           String destincode;
           String seats;
           Scanner key=new Scanner(System.in);
           System.out.println("Give your seat's category:(A or B)");
           do{
               try{
                   seats=key.next();
                   if(!seats.equals("A")&&!seats.equals("B"))
                   {
                       throw new RuntimeException("You gave invalid answer");
                   }
                   continueLoop=false;
               }
               catch (RuntimeException e2)
               {
               System.out.println(e2.getMessage());
               }

           }while(continueLoop);

           System.out.println("Give your flight's code:");

           try {
               flightcode = key.next();
           if(!flightcode.equals(getFlicode()))
               throw new Exception("Wrong code!");

           }
           catch (Exception e3)
           {
           System.out.println(e3.getMessage());
           System.out.println("Please enter again your flight's code!");
               flightcode = key.next();
           }


           System.out.println("Give your flight's starting point:");
           stacode=key.next();
           try {
               if (!stacode.equals(getStartcode()))
                   throw new Exception();
           }
           catch (Exception e4){
               e4.printStackTrace();
               System.out.println("Enter again your starting point's code!");
               stacode=key.next();
           }

           System.out.println("Give your flight's destination");
           destincode=key.next();
           try {
               if(!destincode.equals(getDestcode()))
                   throw new RuntimeException();

           }
           catch (RuntimeException e5){
               e5.printStackTrace();
               System.out.println("Please renter your destination code! ");
               destincode=key.next();
           }


           tickets.add(f1);
         System.out.println(f1);
       }

       public void finalize_flight()
       {
           int passengers;
           Scanner in=new Scanner(System.in);
           System.out.println("How many passengers has this flight:");
           passengers=in.nextInt();
           if(passengers>=1)
           {
               System.out.println("Flight's code:"+flicode+"Plane's code:"+pcode+"Starting point:"+startcode+"Destination:"+destcode+"Date:"+date+"\n");
           }
           else if (passengers<1)
           {
           System.out.println("The flight is wrong and it will be cancelled!");
           }


       }





      }








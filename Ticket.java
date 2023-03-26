package com.setC;

import java.util.Scanner;

public class Ticket
{

   private String code;
   private String name;
   private String surname;
   private String spoint;
   private String destination;
   private double cost;
   private String seats;


   public Ticket()
   {
       code="";
       name="";
       surname="";
       spoint="";
       destination="";
       cost=0;
       seats="";
   }


   public Ticket(String code ,String name,String surname,String spoint,String destination,double cost ,String seats)
   {
       this.code=code;
       this.name=name;
       this.surname=surname;
       this.spoint=spoint;
       this.destination=destination;
       this.cost=cost;
       this.seats=seats;
   }


    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSpoint(String spoint) {
        this.spoint = spoint;
    }

    public String getSpoint() {
        return spoint;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getSeats() {
        return seats;
    }


    public  void readTicket() throws Exception
    {
        Scanner input = new Scanner(System.in);
        boolean loop=true;
        boolean conloop=true;
        System.out.println("Give flight's code: ");
        setCode(input.next());
        System.out.println("Give your name:");
        setName(input.next());
        System.out.println("Give your surname:");
        setSurname(input.next());
        System.out.println("Give your flight's starting point:");
        setSpoint(input.next());
        System.out.println("Give your flight's destination:");
        destination=input.next();

        System.out.println("Give your flight's cost:");

        cost=input.nextDouble();
        do {


            try {
                if (cost <= 1) {
                    throw new RuntimeException("You gave wrong value for the cost of your flight!");
                }
                conloop=false;
            } catch (RuntimeException e6) {
                System.out.println(e6.getMessage());
                cost = input.nextDouble();
            }
        }while (conloop);
        System.out.println("Give your seat's type:(A or B)");
        seats=input.next();
        do {
            try {
                if (!seats.equals("A") && !seats.equals("B")) {
                    throw new Exception();
                }
                loop=false;
            } catch (Exception e7) {
                e7.printStackTrace();
                System.out.println("Give us again your seats type: ");
                seats = input.next();

            }
            finally {
                System.out.println("You gave us your seat's type successfully!");
            }
        }while(loop);


    }



    public String toString()
    {
    return "Flight's code:"+code+"Passenger's name and surname:" + name + surname+"Starting Point:"+spoint+"Destination:"+destination+"Cost of flight:"+cost+"Seat's type:"+seats+"\n" ;
    }

}


package com.setC;

import java.util.Scanner;

public class IFlight extends Flight
{

    private String midstation;
    private   int boardpass;

   public IFlight()
   {
       super();
       midstation="";
       boardpass=0;
   }
   public IFlight(String f,String p,String s,String d,String date,String m,int b)
   {
       super(f, p, s, d, date);
       midstation=m;
       boardpass=b;
   }

    public void setMidstation(String midstation) {
        this.midstation = midstation;
    }

    public String getMidstation() {
        return midstation;
    }

    public void setBoardpass(int boardpass) {
        this.boardpass = boardpass;
    }


    public int getBoardpass() {
        return boardpass;
    }



    public void readIFlight() throws Exception
    {
        String choice;
        super.readFlight();
        Scanner key=new Scanner(System.in);
        System.out.println("Give your the middle station of your flight:");
        midstation=key.next();
        System.out.println("Do you have the possibilty to board or land passengers(Yes or No)");

        do{
            choice=key.next();
        if (choice.equals("Yes"))
        {
        System.out.println("Give the number of passengers you want to board or land:");
        boardpass=key.nextInt();
           if(boardpass<=0)
           {
               System.out.println("The number of boarding or landing passengers is wrong ,try again!");
               boardpass=key.nextInt();
           }


        }
        if(choice.equals("No")) {
            System.out.println("Thank you for your answer,have a nice day");
        }
        }while (!choice.equals("Yes")&&!choice.equals("No"));


    }
      public void Addticket() {
          String choice;
          boolean continueLoop=true;
          String mstation;
          Scanner input = new Scanner(System.in);
          super.addTicket();
          System.out.println("Give the middle station of your flight");
          mstation = input.next();
          try {
              if (!mstation.equals(getMidstation()))
                  throw new Exception();
          } catch (Exception e5) {
              e5.printStackTrace();
              System.out.println("Enter again your middle station!");
              mstation = input.next();
          }

          System.out.println("Can you board or land passengers in your middle station(Of course or no way)");
          choice = input.nextLine();
          do {
              try {
                  if (!choice.equals("Of course") && !choice.equals("no way")) {
                      throw new RuntimeException();
                  }
                  continueLoop = false;

              } catch (RuntimeException runtimeException) {
                  runtimeException.printStackTrace();
                  System.out.println("You didn't give the right answer !");
                  choice = input.next();
              }

          }while (continueLoop);



      }

    @Override
    public void finalize_flight() {
        int pass;
        Scanner key = new Scanner(System.in);
        super.finalize_flight();
        System.out.println("How many passengers have to board or land to the middle station:");
        pass = key.nextInt();

        if (pass >= 1)
        {
            System.out.println("Middle station:" + midstation);
            System.out.println("Boarding or landing passengers:" + boardpass);
        }
        else if(pass<1)
        {
        System.out.println("We don't have to board or land passengers !");
        }

    }
}

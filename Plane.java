package com.setC;

import java.util.Scanner;

public class Plane
{
  private String pcode;
  private int ptype;
  private int maxpasA;
  private int maxpasB;


  public Plane()
  {
      pcode="";
      ptype=0;
      maxpasA=0;
      maxpasB=0;
  }

  public Plane(String pcode,int t,int a,int b)
  {
      this.pcode=pcode;
      ptype=t;
      maxpasA=a;
      maxpasB=b;
  }


    public void setPcode(String pcode)
    {
        this.pcode = pcode;
    }

    public String getPcode()
    {
    return pcode;
    }

    public void setPtype(int ptype) {
        this.ptype = ptype;
    }

    public int getPtype() {
        return ptype;
    }

    public void setMaxpasA(int maxpasA) {
        this.maxpasA = maxpasA;
    }

    public int getMaxpasA() {
        return maxpasA;
    }

    public void setMaxpasB(int maxpasB) {
        this.maxpasB = maxpasB;
    }

    public int getMaxpasB() {
        return maxpasB;
    }


    public void readPlane()
    {
        Scanner key=new Scanner(System.in);
        System.out.println("Give plane's code:");
        pcode=key.next();
        System.out.println("Give plane's type:");
        ptype=key.nextInt();
        System.out.println("Give max number of passengers in zone A");
        do {
            maxpasA = key.nextInt();
                 if(maxpasA<=0){
                     System.out.println("You gave an invalid value ,try again");
                     maxpasA = key.nextInt();
                 }

        }while (maxpasA<=0);
        System.out.println("Give max number of passengers in zone B");
        do {
            maxpasB = key.nextInt();
            if (maxpasB <= 0) {
                System.out.println("You gave an invalid value ,try again");
                maxpasB = key.nextInt();

            }
        }while (maxpasB<=0);





    }


    public String toString()
    {
        return "Plane's code:"+pcode+"Plane's type:"+ptype+"Maximum passengers in zone A:"+maxpasA+"Maximum passengers in zone B:"+maxpasB+"\n";
    }

}

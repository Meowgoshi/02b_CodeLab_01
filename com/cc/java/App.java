package com.cc.java;

public class App {
    
    public static void main(String[] args) 
    {
        Konto konto1 = new Konto("Konto 1" , 10000);

        output(konto1.getName());
        output(String.valueOf(konto1.getKontostand()));
        output("Kontostand * 2 = " + String.valueOf(konto1.getKontostand() * 2));

        output("----------------------------");

        Konto konto2 = new Konto("Konto 2" , 10000);

        output(konto2.getName());
        output(String.valueOf(konto2.getKontostand()));
        output("Kontostand * 3 = " + String.valueOf(konto2.getKontostand() * 3));

        output("----------------------------");

        Konto konto3 = new Konto("Konto 3" , 10000);

        output(konto3.getName());
        output(String.valueOf(konto3.getKontostand()));
        output("Kontostand * 10 = " + String.valueOf(konto3.getKontostand() * 10));
    }


    private static void output(String outputStr) 
    {
        System.out.println(outputStr);
    } 

}
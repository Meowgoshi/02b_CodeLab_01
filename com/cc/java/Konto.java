package com.cc.java;

public class Konto 
{
    private String name;
    private int kontostand;

    public Konto(String name, int kontostand)
    {
        this.name = name;
        this.kontostand = kontostand;
    }

    public String getName()
        {
            return name;
        }

    public void setName(String name)
    {
        this.name = name;
    }
    

    public int getKontostand()
    {
        return kontostand;
    }

    public void setKontostand(int kontostand)
    {
        this.kontostand = kontostand;
    }
}

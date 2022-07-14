package com.itfactory.componente;

public class MemorieSSD {
    private int capacitateStocare;
    private String unitateMasura;

    public MemorieSSD(int capacitateStocare, String unitateMasura)
    {
        this.capacitateStocare = capacitateStocare;
        this.unitateMasura = unitateMasura;
    }

    public void setCapacitateStocare(int capacitateStocare)
    {
        this.capacitateStocare = capacitateStocare;
    }

    public int getCapacitateStocare()
    {
        return capacitateStocare;
    }

    public void setUnitateMasura(String unitateMasura)
    {
        this.unitateMasura = unitateMasura;
    }

    public String getUnitateMasura()
    {
        return unitateMasura;
    }
}

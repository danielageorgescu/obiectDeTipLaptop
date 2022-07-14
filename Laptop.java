package com.itfactory.electronice;

public class Laptop {
    private String marca;
    private String culoare;
    private double dimensiuneEcran;

    public Laptop (String marca, String culoare, double dimensiuneEcran)
    {
        this.marca = marca;
        this.culoare = culoare;
        this.dimensiuneEcran = dimensiuneEcran;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setCuloare(String culoare)
    {
        this.culoare = culoare;
    }

    public String getCuloare()
    {
        return culoare;
    }

    public void setDimensiuneEcran(double dimensiuneEcran)
    {
        this.dimensiuneEcran = dimensiuneEcran;
    }

    public double getDimensiuneEcran()
    {
        return dimensiuneEcran;
    }


}

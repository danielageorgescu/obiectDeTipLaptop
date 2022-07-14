package com.itfactory.componente;

public class MemorieRam {
    private String tipMemorie;
    private String unitateMasura;
    private int capacitateMemorie;

    public MemorieRam(String tipMemorie, String unitateMasura, int capacitateMemorie)
    {
        this.tipMemorie = tipMemorie;
        this.unitateMasura = unitateMasura;
        this.capacitateMemorie = capacitateMemorie;
    }

    public void setTipMemorie(String tipMemorie)
    {
        this.tipMemorie = tipMemorie;
    }

    public String getTipMemorie()
    {
        return tipMemorie;
    }

    public void setUnitateMasura(String unitateMasura)
    {
        this.unitateMasura = unitateMasura;
    }

    public String getUnitateMasura()
    {
        return unitateMasura;
    }

    public void setCapacitateMemorie(int capacitateMemorie)
    {
        this.capacitateMemorie = capacitateMemorie;
    }

    public int getCapacitateMemorie()
    {
        return capacitateMemorie;
    }


}

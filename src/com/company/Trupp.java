package com.company;

public class Trupp {
    private String name;
    private int level;
    private int entwicklungskosten;
    private int baukosten;
    private boolean elixier;
    private int trefferpunkte;
    private double schaden;
    private int bewegungsgeschwindigkeit;
    private double angriffsgeschwindigkeit;
    private int reichweite;
    private int wohnraum;
    private boolean einzel;

    public String get_Name()
    {
        return this.name;
    }

    public void set_Name(String name)
    {
        this.name = name;
    }

    public int get_Level()
    {
        return this.level;
    }

    public void set_Level(int level)
    {
        this.level = level;
    }

    public int get_Entwicklungskosten()
    {
        return this.entwicklungskosten;
    }

    public void set_Entwicklungskosten(int entwicklungskosten)
    {
        this.entwicklungskosten = entwicklungskosten;
    }

    public int get_Baukosten()
    {
        return this.baukosten;
    }

    public void set_Baukosten(int baukosten)
    {
        this.baukosten = baukosten;
    }

    public boolean get_Elixier()
    {
        return this.elixier;
    }

    public void set_Elixier(boolean elixier)
    {
        this.elixier = elixier;

    }

    public int get_Trefferpunkte()
    {
        return this.trefferpunkte;
    }

    public void set_Trefferpunkte(int trefferpunkte)
    {
        this.trefferpunkte = trefferpunkte;
    }

    public double get_Schaden()
    {
        return this.schaden;
    }

    public void set_Schaden(double schaden)
    {
        this.schaden = schaden;
    }

    public int get_Bewegungsgeschwindigkeit()
    {
        return this.bewegungsgeschwindigkeit;
    }

    public void set_Bewegungsgeschwindigkeit(int bewgungsgeschwindigkeit)
    {
        this.bewegungsgeschwindigkeit = bewgungsgeschwindigkeit;
    }

    public double get_Angriffsgeschwindigkeit()
    {
        return this.angriffsgeschwindigkeit;
    }

    public void set_Angriffsgeschwindigkeit(double angriffsgeschwindigkeit)
    {
        this.angriffsgeschwindigkeit = angriffsgeschwindigkeit;
    }

    public int get_Reichweite()
    {
        return this.reichweite;
    }

    public void set_Reichweite(int rechweite)
    {
        this.reichweite = rechweite;
    }

    public int get_Wohnraum()
    {
        return this.wohnraum;
    }

    public void set_Wohnraum(int wohnraum)
    {
        this.wohnraum = wohnraum;
    }

    public boolean get_Einzel()
    {
        return this.einzel;
    }

    public void set_Einzel(boolean einzel)
    {
        this.einzel = einzel;
    }
    public Trupp()
    {
        this("", 0 , 0, 0,false, 0, 0, 0, 0, 0, 0, false);
    }

    public Trupp(String name, int level, int entwicklungskosten, int baukosten)
    {
        this.name = name;
        this.level = level;
        this.entwicklungskosten = entwicklungskosten;
        this.baukosten = baukosten;
        this.elixier = false;
        this.trefferpunkte = 0;
        this.schaden = 0;
        this.bewegungsgeschwindigkeit = 0;
        this.angriffsgeschwindigkeit = 0;
        this.reichweite = 0;
        this.wohnraum = 0;
        this.einzel = false;
    }

    public Trupp(String name, int level, int entwicklungskosten, int baukosten, boolean elixier, int reichweite)
    {
        this.name = name;
        this.level = level;
        this.entwicklungskosten = entwicklungskosten;
        this.baukosten = baukosten;
        this.elixier = elixier;
        this.trefferpunkte = 0;
        this.schaden = 0;
        this.bewegungsgeschwindigkeit = 0;
        this.angriffsgeschwindigkeit = 0;
        this.reichweite = reichweite;
        this.wohnraum = 0;
        this.einzel = false;
    }

    public Trupp(String name, int level, int entwicklungskosten, int baukosten, boolean elixier, int trefferpunkte, double schaden, int bewegungsgeschwindigkeit, double angriffsgeschwindigkeit, int reichweite, int wohnraum, boolean einzel )
    {
        this.name = name;
        this.level = level;
        this.entwicklungskosten = entwicklungskosten;
        this.baukosten = baukosten;
        this.elixier = false;
        this.trefferpunkte = trefferpunkte;
        this.schaden = schaden;
        this.bewegungsgeschwindigkeit = bewegungsgeschwindigkeit;
        this.angriffsgeschwindigkeit = angriffsgeschwindigkeit;
        this.reichweite = reichweite;
        this.wohnraum = wohnraum;
        this.einzel = false;
    }
}

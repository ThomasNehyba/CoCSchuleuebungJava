package com.company;

public class Held {
    private String name;
    private int level;
    private int kosten;
    private int trefferpunkte;
    private int regenerationszeit;
    private double schaden;
    private String spezialfaehigkeit;

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

    public int get_Kosten()
    {
        return this.kosten;
    }

    public void set_Kosten(int kosten)
    {
        this.kosten = kosten;
    }

    public int get_Trefferpunkte()
    {
        return this.trefferpunkte;
    }

    public void set_Trefferpunkte(int trefferpunkte)
    {
        this.trefferpunkte = trefferpunkte;
    }

    public int get_Regenerationszeit()
    {
        return this.regenerationszeit;
    }

    public void set_Regenerationszeit(int regenerationszeit)
    {
        this.regenerationszeit = regenerationszeit;
    }
    public double get_Schaden()
    {
        return this.schaden;
    }

    public void set_Schaden(double schaden)
    {
        this.schaden = schaden;
    }

    public String get_Spezialfaehigkeit()
    {
        return this.spezialfaehigkeit;
    }

    public void set_Spezialfaehigkeit(String spezialfaehigkeit)
    {
        this.spezialfaehigkeit = spezialfaehigkeit;
    }





    public Held()
    {
        this("", 0,0,0,0,0,"");
    }

    public Held(String name, int level)
    {
        this.name = name;
        this.level = level;
        this.kosten = 0;
        this.trefferpunkte = 0;
        this.regenerationszeit = 0;
        this.schaden = 0;
        this.spezialfaehigkeit = "";
    }

    public Held(String name, int level, int kosten, int trefferpunkte)
    {
        this.name = name;
        this.level = level;
        this.kosten = kosten;
        this.trefferpunkte = trefferpunkte;
        this.regenerationszeit = 0;
        this.schaden = 0;
        this.spezialfaehigkeit = "";

    }

    public Held(String name, int level, int kosten, int trefferpunkte, int regenerationszeit, double schaden, String spezialfaehigkeit)
    {
        this.name = name;
        this.level = level;
        this.kosten = kosten;
        this.trefferpunkte = trefferpunkte;
        this.regenerationszeit = regenerationszeit;
        this.schaden = schaden;
        this.spezialfaehigkeit = spezialfaehigkeit;
    }
}

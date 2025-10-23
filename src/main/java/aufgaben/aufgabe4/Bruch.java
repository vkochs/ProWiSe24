package aufgaben.aufgabe4;

public class Bruch
{
    private int zaehler;
    private int nenner;

    public Bruch()
    {
        this.zaehler = 1;
        this.nenner = 1;
    }

    public Bruch(int zaehler, int nenner) 
    {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    private int ggT()
    {
        int a = this.zaehler;
        int b = this.nenner;
        int merke = b;
        while(b!=0)
        {
            merke = a % b;
            a = b;
            b = merke;
        }
        return a;
    }

    public Bruch kuerzen()
    {
        int ggT = this.ggT();
        int zaehler = this.zaehler/ggT;
        int nenner = this.nenner/ggT;
        return new Bruch(zaehler,nenner);
    }

    public Bruch plus(Bruch b)
    {
        int zaehler = this.zaehler*b.nenner + b.zaehler*this.nenner;
        int nenner = this.nenner*b.nenner;
        return (new Bruch(zaehler,nenner)).kuerzen();
    }

    public Bruch minus(Bruch b)
    {
        int zaehler = this.zaehler*b.nenner - b.zaehler*this.nenner;
        int nenner = this.nenner*b.nenner;
        return (new Bruch(zaehler,nenner)).kuerzen();
    }

    public Bruch mal(Bruch b)
    {
        int zaehler = this.zaehler*b.zaehler;
        int nenner = this.nenner*b.nenner;
        return (new Bruch(zaehler,nenner)).kuerzen();
    }   

    public Bruch geteilt(Bruch b)
    {
        int zaehler = this.zaehler*b.nenner;
        int nenner = this.nenner*b.zaehler;
        return (new Bruch(zaehler,nenner)).kuerzen();
    }   

    public String toString()
    {
        return this.zaehler + "/" + this.nenner;
    }

    public boolean istGroesser(Bruch b)
    {
        return this.zaehler * b.nenner > b.zaehler * this.nenner;
    }


    public boolean istKleiner(Bruch b)
    {
        return this.zaehler * b.nenner < b.zaehler * this.nenner;
    }


    public boolean istGleich(Bruch b)
    {
        return !this.istGroesser(b) && !istKleiner(b);
    }
}

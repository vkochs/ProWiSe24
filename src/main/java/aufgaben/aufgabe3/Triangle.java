package aufgaben.aufgabe3;

public class Triangle
{
    private int a;
    private int b;
    private int c;

    public Triangle(int pa, int pb, int pc)
    {
        this.a = pa;
        this.b = pb;
        this.c = pc;
    }

    public int circumference()
    {
        return this.a + this.b + this.c;
    }

    public double area()
    {
        double area = 0.0;
        double s = 0.5 * (this.a+this.b+this.c);
        area = Math.sqrt(s * (s-this.a) * (s-this.b) * (s-this.c));
        return area;
    }

    public boolean equilateral()
    {
        return this.a==this.b && this.b==this.c;
    }

    public boolean isosceles()
    {
        return this.a==this.b || this.b==this.c || this.c==this.a;
    }

    public void print()
    {
        System.out.println("Seiten          : a=" + this.a + ", b=" + this.b + ", c=" + this.c);
        System.out.println("Umfang          : " + this.circumference());
        System.out.println("Flaecheninhalt  : " + this.area());
        if(this.equilateral())
        {
            System.out.println("Das Dreieck ist gleichseitig.");
        }
        else
        {
            if(this.isosceles())
            {
                System.out.println("Das Dreieck ist gleichschenklig.");
            }
            else
            {
                System.out.println("Das Dreieck ist unregelmaessig.");
            }
        }
        if(this.isRightAngled())
        {
            System.out.println("Das Dreieck ist rechtwinklig.");
        }
        else
        {
            System.out.println("Das Dreieck ist nicht rechtwinklig.");
        }
        System.out.println();
    }

    public boolean sameCircumference(Triangle t)
    {
        return this.circumference()==t.circumference();
    }

    public boolean sidesAreEqual(Triangle t)
    {
        return (this.a==t.a && this.b==t.b && this.c==t.c) ||
                (this.a==t.b && this.b==t.c && this.c==t.a) ||
                (this.a==t.c && this.b==t.a && this.c==t.b);
    }

    public boolean isRightAngled()
    {
        return ((this.a*this.a == (this.b*this.b + this.c*this.c)) ||
                (this.b*this.b == (this.a*this.a + this.c*this.c)) ||
                (this.c*this.c == (this.b*this.b + this.a*this.a)));
    }

    public boolean isSmaller(Triangle t)
    {
        return this.area() < t.area();
    }

    public boolean isBigger(Triangle t)
    {
        return this.area() > t.area();
    }
}

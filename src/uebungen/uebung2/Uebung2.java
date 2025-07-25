package uebungen.uebung2;

public class Uebung2 {

    public static void main(String[] args) {
        
        int hours = 34567;
        int day = 24;
        int days = hours/day;
        int restHour = hours%day;
        System.out.println("Es sind " + days + " enthalten. Und " + restHour + " Stunden.");
        
        
        // double x= 100;
        // double y = 3;
        // double quotient = x/y;
        // double rest = x%y;

        //int product = x*y;
       // boolean productEven = product%2 == 0;
        //boolean productOdd = !productEven;

       //System.out.println(x + " geteilt durch " + y + " ergibt " + quotient + ". Es bleibt ein Rest von " + rest);
        //System.out.println("Gerade?: " + productEven);
        //System.out.println("Ungerade? " + productOdd);
    }
}

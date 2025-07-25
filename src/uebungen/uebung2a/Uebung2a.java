package uebungen.uebung2a;

public class Uebung2a {
    public static void printIntDivision(int nr1, int nr2)
    {
        
        if (nr2 !=0){
           //System.out.println(nr2);
            int quotient = getQuotient(nr1, nr2);
            int rest = getRemainder(nr1, nr2);
        System.out.print(nr1 + " geteilt durch " + nr2 + " ergibt " + quotient);
        if (rest != 0){
          //  System.out.println("ja");
            System.out.println( ". Es bleibt ein Rest von " + rest);

        } 
        else{
           // System.out.println("nein");
            System.out.println(  ". Es bleibt kein Rest.");

        }
    }
    else{
        System.out.println(" Dies ist nicht definiert!");
    }
    }

    public static int getQuotient (int nr1, int nr2) {
        return nr1/nr2;
    }

    public static int getRemainder (int nr1, int nr2){
        return nr1%nr2;
    }

    public static void main(String[] args) {
        printIntDivision(16, 0);
    }



}

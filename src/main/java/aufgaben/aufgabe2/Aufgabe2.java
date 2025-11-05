package aufgaben.aufgabe2;

public class Aufgabe2 {
public static int lengthOfNumber(int number){
    if (number==0){
        return 0;}
    else{
        int zaehler = 1;
        int zahl = Math.abs(number);
        for(int i=0; zahl > 9; i++){
            zahl/=10;
            zaehler++;
            
        }
        return zaehler;
    }
    
}
 public static int firstDigit(int number){
    
    int zahl = Math.abs(number);
    if (zahl<9){
        return zahl;
    }
    else{
        System.out.print("else erreicht");
        int ersteStelle = 1;
        
         System.out.print("else erreicht");
        while (zahl>9) {
            System.out.print("while erreicht");
            int teiler = 10;
            int i=zahl/teiler;
            System.out.print("i: "+i);
            zahl=i;
           
        }
        return zahl;
         
    }
   
}
/*public static int powerOf10ToN(int n){
    return 0;
}
public static int cutFirstDigit(int number){
    return 0;
}
public static boolean secondDigitIsZero(int number){
    return false;
} */
public static void main(String[] args) {
    //System.out.println("Länge: " +lengthOfNumber(10)
     System.out.println("erste Stelle: " +firstDigit(10)     
    );
}
}


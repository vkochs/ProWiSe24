package aufgaben;

public class Aufgabe1 
{

    /*
     * upperHalf: the number of rows in the upper half of the rhombus   
     * filled: true if the rhombus should be filled, false if it should be unfilled
     */
    public static void printRhombus(int upperHalf, boolean filled) 
    {
        if (filled) 
        {
            printRhombusFilled(upperHalf);
        } 
        else 
        {

            printRhombusUnfilled(upperHalf);
        }
    }

    /*
    * printNChars: prints n characters of the given character  
    * n: the number of characters to print
    * c: the character to print
    */
    private static void printNChars(int n, char c) 
    {
        for (int i = 0; i < n; i++) 
        {
            System.out.print(c);
        }
    }

    /*
     * printRhombusUnfilledUpperHalf: prints the upper half of the rhombus
     * upperHalf: the number of rows in the upper half of the rhombus
     */
    private static void printRhombusUnfilledUpperHalf(int upperHalf) 
    {
        for (int row = 0; row < upperHalf; row++) 
        {
            if(row == 0) 
            {
                printNChars(upperHalf, ' ');
                printNChars(1, '*');
            } 
            else 
            {
                printNChars(upperHalf-row, ' ');
                printNChars(1, '*');
                printNChars(row*2-1, ' ');
                printNChars(1, '+');
            }
            System.out.println();
        }
    }

    /*
     * printRhombusUnfilledLowerHalf: prints the lower half of the rhombus
     * upperHalf: the number of rows in the upper half of the rhombus
     */
    private static void printRhombusUnfilledLowerHalf(int upperHalf) 
    {
        for (int row = upperHalf-1; row >= 0; row--) 
        {
            if(row == 0) 
            {
                printNChars(upperHalf, ' ');
                printNChars(1, '*');
            } 
            else 
            {
                printNChars(upperHalf-row, ' ');
                printNChars(1, '*');
                printNChars(row*2-1, ' ');
                printNChars(1, '*');
            }
            System.out.println();
        }
    }


    /*
     * printRhombusFilledUpperHalf: prints the upper half of the rhombus
     * upperHalf: the number of rows in the upper half of the rhombus
     */
    private static void printRhombusFilledUpperHalf(int upperHalf) 
    {
        for (int row = 0; row < upperHalf; row++) 
        {
            printNChars(upperHalf-row, ' ');
            printNChars(row*2+1, '*');
            System.out.println();
        }
    }

    /*
     * printRhombusFilledLowerHalf: prints the lower half of the rhombus
     * upperHalf: the number of rows in the upper half of the rhombus
     */
    private static void printRhombusFilledLowerHalf(int upperHalf) 
    {
        for (int row = upperHalf-1; row >= 0; row--) 
        {
            printNChars(upperHalf-row, ' ');
            printNChars(row*2+1, '*');
            System.out.println();
        }
    }

    /*
     * printRhombusFilled: prints the rhombus
     * upperHalf: the number of rows in the upper half of the rhombus
     */
    private static void printRhombusFilled(int upperHalf) 
    {
        printRhombusFilledUpperHalf(upperHalf);
        printMiddleRowFilled(upperHalf);
        printRhombusFilledLowerHalf(upperHalf);
        System.out.println();
    }

    /*
     * printMiddleRowFilled: prints the middle row of the rhombus
     * upperHalf: the number of rows in the upper half of the rhombus
     */
    private static void printMiddleRowFilled(int upperHalf) 
    {
        printNChars(2*upperHalf+1, '*');
        System.out.println();
    }

    /*
     * printMiddleRowUnfilled: prints the middle row of the rhombus
     * upperHalf: the number of rows in the upper half of the rhombus
     */
    private static void printMiddleRowUnfilled(int upperHalf) 
    {
        printNChars(1, '*');
        printNChars(2*upperHalf-1, ' ');
        printNChars(1, '*');
        System.out.println();
    }

    /*
     * printRhombusUnfilled: prints the rhombus
     * upperHalf: the number of rows in the upper half of the rhombus
     */
    private static void printRhombusUnfilled(int upperHalf) 
    {
        printRhombusUnfilledUpperHalf(upperHalf);
        printMiddleRowUnfilled(upperHalf);
        printRhombusUnfilledLowerHalf(upperHalf);
        System.out.println();
    }   

    public static void main(String[] args) 
    {
        printRhombus(1, true);
        printRhombus(1, false);
        //printRhombus(5, true);
        //printRhombus(5, false);
        //printRhombus(10, true);
        //printRhombus(10, false);
        //printRhombus(15, true);
        //printRhombus(15, false);
        
    }
}

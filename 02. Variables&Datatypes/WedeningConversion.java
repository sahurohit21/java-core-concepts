import java.lang.*;

class WedeningConversion // Widening_Conversion
{
    public static void main(String args[]) {
        int i = 10;
        long l = i;
        float f = i;
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        float f1 = 1.53f;
        int i1 = (int) f1; // Type_Conversion, Otherwise Error
        System.out.println(i1);

        char c = 'A';
        int i2 = c; // Widening_Conversion from char to int
        float f2 = c; // Widening_Conversion from char to float
        System.out.println(c);
        System.out.println(i2);
        System.out.println(f2);
    }

}
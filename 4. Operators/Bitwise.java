public class Bitwise {
    public static void main(String[] args) {
        int a = 0b1010;
        int b = 0b0110;
        int c = -0b1010;
        int and = a & b;
        int or = a | b;
        int xor = a ^ b;
        int ls = a << 2; // Left_Shift
        int rs = c >> 1; // Right_Shift
        int urs = c >>> 1; // Unsigned_Right_Shift
        System.out.println("AND of a and b is " + and);
        System.out.println("OR of a and b is " + or);
        System.out.println("XOR of a and b is " + xor);
        System.out.println("LeftShift of a by 2 is " + ls);
        System.out.println("RightShift of c by 1 is " + rs);
        System.out.println("RightShift of c by 1 is " + urs);

    }

}

public class Printf {

    public static void main(String[] args) {
        int x = 10;
        float y = 10.8f;
        char z = 'B';
        System.out.printf("Hello %d %f %c World\n ", x, y, z); // %d = decimal
        System.out.printf("Hello %o %f %c World\n ", x, y, z); // %o = octal
        System.out.printf("Hello %x %f %c World\n ", x, y, z); // %x = hexa

        System.out.printf("%.2f", 3.14568);  //%.2f = upto_two_decimal_digits
    }

}

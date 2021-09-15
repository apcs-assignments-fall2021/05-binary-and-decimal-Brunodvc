import java.util.Scanner;

public class MyMain {

    // Given a String representing a binary number (e.g. "1010") as input,
    // and returns the decimal value of that number.
    // You can use Integer.parseInt() to convert a String into a **decimal** number.
    // Ex. binaryToDecimal("1010") => 10 (ten)
    //     binaryToDecimal("110010") => 50
    public static int binaryToDecimal(String binary) {
        int intbinary = Integer.parseInt(binary);
        int total = 0;
        double multiplier = 1.0;
        int last = intbinary % 10;

        while (intbinary > 0){
            total += (last*multiplier);
            intbinary /= 10;
            multiplier = multiplier * 2;
            last = intbinary % 10;
        }

        return total;
    }

    // Given a decimal number (e.g. 152) as input, and returns a String
    // representing the binary representation of that number.
    // Ex. decimalToBinary(7) => "111"
    //     decimalToBinary(152) => "10011000"
    public static String decimalToBinary(int decimal) {
        StringBuilder total = new StringBuilder();
        if (decimal == 0){
            return "0";
        }
       while(decimal > 0){
            total.append(decimal % 2);
            decimal /= 2;
        }
        return String.valueOf(total.reverse());
   }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("give me a number in binary");
        String binary = scan.nextLine();
        binaryToDecimal((String)binary);
        System.out.println(binaryToDecimal((String)binary));


        System.out.println("give me a digit");
        int decimal = scan.nextInt();
        decimalToBinary((int) decimal);
        System.out.println(decimalToBinary((int) decimal));

    }
}

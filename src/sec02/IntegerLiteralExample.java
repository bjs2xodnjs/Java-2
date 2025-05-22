package sec02;

public class IntegerLiteralExample {
    public static void main(String[] args) {
        int var1 = 0b1011;
        int var2 = 0206;
        int var3 = 365;
        int var4 = 0xB3;

        System.out.println("var1:" + var1);
        System.out.println("var1:" + var2);
        System.out.println("var1:" + var3);
        System.out.println("var1:" + var4);

        System.out.println("var3 -2진수: " + Integer.toBinaryString(var3));
        System.out.println("var3 -8진수: " + Integer.toOctalString(var3));
        System.out.println("var3 -16진수: " + Integer.toHexString(var3));

        //FFFFFF
        //...... (15*16*16)  +   (15*16) + 15
    }
}

public class tuto {

    public static void main(String[] args) {
        float money;

        int cash = 25;
        money = cash; // Converts from int to float
        System.out.println(money);
        double num1 = 2.0;
        int num2 = 6;
        System.out.println(num2/num1);
        double d = 16.987;
        float f = (float) d;	// Converts from double to float without any loss of data
        int i = (int) f;	// Converts from float to int with loss of data
        long l = (long) i;	// Converts from int to long without any loss of data
        System.out.println(d);
        System.out.println(f);
        System.out.println(i);
        System.out.println(l);
    }
}
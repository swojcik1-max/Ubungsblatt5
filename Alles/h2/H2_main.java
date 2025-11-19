package h2;

public class H2_main {
    public static void main(String[] arg) {
        int n = 1299 ;
        int digits =  0;
        int a [] = new int [9];
        String print = "";
        digits = (n + "").length();

        System.out.println("The Number: " + n + " has " + digits + " digits.");

        for(int i = 0 ; i < digits; i++){
        a[a.length - 1 - i] = n % 10;
        n = n/10;
        }

        for(int i = 0 ; i < a.length; i++) {
            print += (a[i] + "  ");
        }
        System.out.println(print);




    }
}

package h1;

public class H1_main {
    public static void main(String[] arg) {
        int myArray [] = { 1, 2 , 3 , 4 , 5 ,6 ,7 , 8} ;
        int temp1 ;
        for(int i = 0 ; i <= (myArray.length - 1) / 2; i++){
            temp1 = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = temp1;
        }
        for(int i = 0 ; i < myArray.length  ; i++){
            System.out.println(myArray[i] + " final");
        }
    }
}

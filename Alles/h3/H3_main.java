package h3;

public class H3_main {
    public static void main(String[] arg) {

    //int einheiten [][] = new int [2][15];
    //50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1
    //int einheiten [][] = { {50000,0}, {20000,0}, {10000,0}, {5000,0}, {2000,0}, {1000,0}, {500,0}, {200,0}, {100,0}, {50,0}, {20,0}, {10,0}, {5,0}, {2,0}, {1,0} };
        int einheiten [][] = {{50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
    int input = 299;
    String print = input + "$ breaks down to ";
    for(int i = 0 ; i < einheiten[0].length; i++){
        if(input - einheiten[0][i] >= 0){
            input -= einheiten[0][i];
            einheiten[1][i] += 1;
            if(input - einheiten[0][i] >= 0){
                input -= einheiten[0][i];
                einheiten[1][i] += 1;
            }
        }
    }
    for(int i = 0 ; i < einheiten[0].length ; i++){
        if(einheiten[1][i] == 1) {
            print +=  " + " + einheiten[0][i] ;
        } else if(einheiten[1][i] == 2) {
            print +=  " + " + einheiten[0][i] + " * " + einheiten[1][i] ;
        }
    }
    System.out.println(print);

    }

}

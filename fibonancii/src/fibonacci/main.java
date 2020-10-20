package fibonacci;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Marshallein
 */
public class main {

    public static void main(String[] args) {
        main ob = new main();
        for (int i = 0; i < 45; i++) {
            System.out.println(ob.fibonacii(i));
        }

    }

    public int fibonacii(int n) {
        if (n < -1) {
            return -1;

        } else if (n == 0 || n == 1) {
            return n;

        } else {
            return fibonacii(n - 1) + fibonacii(n - 2);
        }
    }

}
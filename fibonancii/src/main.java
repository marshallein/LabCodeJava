/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author Marshallein
 */
public class main {
    int value[] = new int[100];
    public static void main(String[] args) {
        main ob = new main();
        ob.value[0] = 0;
        ob.value[1] = 1;
        for (int i = 2; i < 45; i++) {
            ob.value[i] = -2;
        }
        ob.fibonacii(45);
        for (int i = 0; i < 45; i++) {
            System.out.print(ob.value[i] + " ");
        }
       
        

    }

    public int fibonacii(int n) {
        if (n < -1) {
            return -1;
        } 
        else if (n == 0 || n == 1) return n;
        else if(value[n-1] != -2) return value[n-1];

        else {
            return value[n-1] = fibonacii(n - 1) + fibonacii(n - 2);
        }
    }

}

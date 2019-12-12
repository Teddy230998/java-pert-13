/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg38.recursive.bercabang;
import java.util.*;
import java.lang.String;
/**
 *
 * @author baciel
 */
public class RecursiveBercabang {

  public static void main (String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.print("masukan nilai n = ");
        int nilai = userInput.nextInt();
        int nilai_fibonacci = fibonacci(nilai, "atas");
        System.out.println("nilai fibonacci ke-"+ nilai +" adalah " + nilai_fibonacci);
    }


    private static int fibonacci(int n, String daun){
        System.out.println("daun " + daun);
        System.out.println("Fibonacci ke - " + n);
        if (n == 1 || n == 0){
            return n;
        }
        else {
            return fibonacci(n - 1, "kiri") + fibonacci(n - 2, "kanan");
        }
    }

}
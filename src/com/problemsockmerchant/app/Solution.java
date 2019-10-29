package com.problemsockmerchant.app;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        //Variables declaration
        int sockNumber = 0;
        int result = 0;

        //Object declaration
        Scanner in = new Scanner(System.in);

        //Get number of socks
        sockNumber = in.nextInt();

        //Array declaration
        int[] arraySock = new int[sockNumber];

        //Add socks to array
        for (int i = 0; i < sockNumber; i++) {
            arraySock[i] = in.nextInt();
        }

        result = sockMerchant(sockNumber, arraySock);

        //Output result
        System.out.println(result);

        //Close input
        in.close();
    }

    static int sockMerchant(int n, int[] ar) {
        //Variables declaration
        int aux = 0;
        int totalMatch = 0;

        //Burbble sort
        for(int i = 0; i < ar.length; i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(ar[i] < ar[j])
                {
                    aux = ar[j];
                    ar[j] = ar[i];
                    ar[i] = aux;
                }
            }
        }

        //Count matches
        for(int i = 0; i < ar.length-1; i++)
        {
            if((i < n) && (ar[i] == ar[i+1]))
            {
                i++;
                totalMatch++;
            }
        }
        return totalMatch;
    }

}

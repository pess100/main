package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int sum=0;int max=0;
        for (int i = 0; i < n; i++) {
        int elem=Integer.parseInt(scanner.nextLine());
        if(max<=elem)max=elem;
        sum+=elem;
    }
            if(sum==2*max) {
            System.out.println("Yes");
            System.out.println("Sum = "+max);
            }else{
            System.out.println("No");
            System.out.println("Diff = "+Math.abs(sum-2*max));
        }


}}

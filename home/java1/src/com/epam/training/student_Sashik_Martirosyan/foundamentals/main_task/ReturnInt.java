package com.epam.training.student_Sashik_Martirosyan.foundamentals.main_task;

public class ReturnInt {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b =Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int sum = a+b+c+d;
        int number=a*b*c*d;
        System.out.println(sum);
        System.out.println(number);
    }
}

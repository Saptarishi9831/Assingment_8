package com.oopsconcept;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison problem");
        System.out.println("Enter the values of x1 and y1 for first line coordinates");
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Enter the values of x2 and y2 for first line coordinates");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.println("Enter the values of x3 and y3 for second line coordinates");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        System.out.println("Enter the values of x4 and y4 for second line coordinates");
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();
        LineComparison Ln =new LineComparison();
        Ln.LengthCompute1(x1,y1,x2,y2);
        Ln.LengthCompute2(x3,y3,x4,y4);
        Ln.Equality(x1,x2,x3,x4,y1,y2,y3,y4);
        Ln.Compare(x1,x2,x3,x4,y1,y2,y3,y4);
    }

    public void LengthCompute1(double x1, double y1, double x2, double y2) {
        double a = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
        double length1 = (double) Math.sqrt(a);
        System.out.println("The length of the first line is:" + length1);
    }

    public void LengthCompute2(double x3, double y3, double x4, double y4) {
        double b = (x4 - x3)*(x4 - x3)  + (y4 - y3)*(y4 - y3);
        double length2 = (double) Math.sqrt(b);
        System.out.println("The length of the second line is:" + length2);
    }
    public void Equality(double x1,double x2,double x3,double x4,double y1,double y2,double y3,double y4)
    {
        double a = (x2 - x1)*(x2 - x1)+ (y2 - y1)*(y2 -y1);
        double length1 = (double) Math.sqrt(a);
        double b = (x4 - x3)*(x4 - x3)+ (y4 - y3)*(y4 - y3);
        double length2 = (double) Math.sqrt(b);
        String l1 = Double.toString(length1);
        String l2 = Double.toString(length2);
        boolean equal =l1.equals(l2);
        System.out.println("The equality of two strings is:" + equal);
    }
    public void Compare(double x1,double x2,double x3,double x4,double y1,double y2,double y3,double y4)
    {
        double a = (x2 - x1)*(x2 - x1)+ (y2 - y1)*(y2 -y1);
        double length1 = (double) Math.sqrt(a);
        double b = (x4 - x3)*(x4 - x3)+ (y4 - y3)*(y4 - y3);
        double length2 = (double) Math.sqrt(b);
        String l1 = Double.toString(length1);
        String l2 = Double.toString(length2);
        int comp = l1.compareTo(l2);
        if(comp>0)
        {
            System.out.println("first line is greater than second line");
        }
        else if(comp==0)
        {
            System.out.println("both lines are equal");
        }
        else
        {
            System.out.println("second line greater than first line");
        }
    }
}


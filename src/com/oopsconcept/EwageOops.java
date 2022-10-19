package com.oopsconcept;

public class EwageOops {
    public void EmpCheck() {
        int full_time = 2;
        int half_time = 1;
        int absent = 0;
        int check = (int) (Math.random() * 3);
        if (check == full_time) {
            System.out.println("Employee working full time");
        } else if(check == half_time) {
            System.out.println("Employee working half time ");
        }
        else{
            System.out.println("The employee is not present");
        }
    }
    public void EmpWage(int a,int b)
    {
        int Emp_Rate_per_hour = a;
        int Emp_hours =b;
        int Emp_half_hours =4;
        int emp_wage = Emp_hours *Emp_Rate_per_hour;
        System.out.println("The daily employee wage of the employee is" + " " + emp_wage);

    }
    public void MonthlyWage(int a ,int b,int c)
    {
        int Emp_Rate_per_hour = a;
        int Emp_hours =b;
        int Emp_half_hours =4;
        int emp_wage = a*b;
        int Total_Working_Days = c;
        int monthly_wage = a*b*c;
        System.out.println("Monthly wage is:" + monthly_wage );


    }
    public static void main(String args[]) {
        System.out.println("Welcome to Employee wage computation");
        EwageOops ob1 = new EwageOops();
        ob1.EmpCheck();
        ob1.EmpWage(20,8);
        ob1.MonthlyWage(20,8,20);
    }
}

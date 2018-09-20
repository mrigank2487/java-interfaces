import java.util.Scanner;
import java.io.*;
class student
{
    private String name;
    private int RollNo;
    void getdata()
    {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter name: ");
        name=Sc.nextLine();
        System.out.println("Enter Roll Number: ");
        RollNo=Sc.nextInt();
    }
    
    void displaydata()
    {
        System.out.println();
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+RollNo);
    }
}

class marks extends student
{
    private int m1,m2,m3,m4,m5;
    void getmarks()
    {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects: ");
       m1= Sc.nextInt();
        m2= Sc.nextInt();
        m3= Sc.nextInt();
        m4= Sc.nextInt();
        m5= Sc.nextInt();
    }
    void displaymarks()
    {
        System.out.println("Marks are: "+m1+" ,"+m2+" ,"+m3+" ,"+m4+" ,"+m5);
    }
    int returnmarks()
    {
        return(m1+m2+m3+m4+m5);
    }
}

interface sportsmarks
{
    final static int sportsmark=90;
}
class result extends marks implements sportsmarks 
{
    private int total;
    private float percentage;
    void calculate()
    {
        total=returnmarks()+sportsmark;
        percentage=total/6;
    }
    void displayall()
    {
        displaydata();
        displaymarks();
        System.out.println("Total is: "+total);
        System.out.println("Percentage is: "+percentage);
    }
}



public class Sports
{
    public static void main(String args[]) throws IOException
    {
        result r=new result();
        r.getdata();
        r.getmarks();
        r.calculate();
        r.displayall();
    }
}

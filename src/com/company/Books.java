
package com.company;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Books {
    Scanner scan = new Scanner(System.in);
    public static String[] books = new String[20];
    public static String[] Start_date = new String[20];
    public static String[] End_date = new String[20];
    public static float[] Hour = new float[20];
    public static float[] Rating = new float[20];
    public static String[] temp_rat = new String[20];
    public static float[] Day = new float[20];
    public static float total_hour = 0, total_day = 0, rat = 0;
    private static int count = 0;
    public static int i = 0;

    public void addBook() {
        System.out.print("Enter the book name:");
        books[i] = scan.nextLine();

        System.out.print("Enter the start date in the format yyyy-mm-dd:");
        Start_date[i] = scan.nextLine();

        System.out.print("Enter the end date in the format yyyy-mm-dd:");
        End_date[i] = scan.nextLine();

        System.out.print("Enter the consumption in hour:");
        Hour[i] = scan.nextFloat();
        total_hour = total_hour + Hour[i];

        System.out.print("Enter your rating out of 10:");
        Rating[i] = scan.nextFloat();
        rat = rat + Rating[i];

        System.out.print("Enter the total day of consumption:");
        Day[i] = scan.nextFloat();
        total_day = total_day + Day[i];
        i++;
        count++;
    }

    public void edit_hour(int k){
        System.out.println("Add consumption in hour:");
        Float newConHour=scan.nextFloat();
        Hour[k-1]=Hour[k-1]+newConHour;
        total_hour=total_hour+newConHour;
    }
    public void edit_day(int k){
        System.out.println("Add consumption in day:");
        Float newConDay=scan.nextFloat();
        Day[k-1]=Day[k-1]+newConDay;
        total_day=total_day+newConDay;
    }
    public void edit_rat(int k){
        System.out.println("Add new rating:");
        Float newRat=scan.nextFloat();
        rat=rat-Rating[k-1];
        Array.set(Rating,k-1,newRat);
        temp_rat[k-1]=Float.toString(newRat);
        rat=rat+newRat;
    }
    public void edit_end(int k) {
        System.out.println("Add end date in the format yyyy-mm-dd:");
        End_date[k - 1] = scan.nextLine();
    }

    public void delete_book(int x){
        int k=x-1;
        rat=rat-Rating[k];
        for (int j = k; j<i-1; j++) {
            books[j] = books[j+1];
        }
        for (int j = k; j<i-1; j++) {
            Start_date[j] = Start_date[j+1];
        }
        for (int j = k; j<i-1; j++) {
            End_date[j] = End_date[j+1];
        }
        for (int j = k; j<i-1; j++) {
            Hour[j] = Hour[j+1];
        }
        for (int j = k; j<i-1; j++) {
            Rating[j] = Rating[j+1];
        }
        for (int j = k; j<i-1; j++) {
            Day[j] = Day[j+1];
        }
        i--;
    }

    public void display_book(){
        System.out.println("==========Book List==========\n");
        System.out.printf( "%5s|| %30s|| %20s|| %20s|| %10s||" + "", "Index", "Book Name", "Consumption(Hour)", "Consumption(Day)","Rating");
        System.out.println();

        for(int j=0;j<i;j++) {
            int k = j+1;
            System.out.format("%5s %30s %20f %20f %10s", k,books[j],Hour[j],Day[j],Rating[j]);
            System.out.println();
        }
    }
    public void show_details(int p){
        int id=p-1;
        System.out.printf("%30s %15s %15s %18s %18s %6s", "Book Name","Start_Date","End_Date", "Consumption(Hour)", "Consumption(Day)","Rating");
        System.out.println();
        System.out.format("%30s %15s %15s %18f %18f %6s", books[id],Start_date[id],End_date[id],Hour[id],Day[id],Rating[id]);
        System.out.println();
    }


}
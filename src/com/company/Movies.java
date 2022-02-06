
package com.company;
import java.util.Scanner;

public class Movies {
    Scanner scan = new Scanner(System.in);
    public static String[] movies = new String[20];
    public static String[] Start_date = new String[20];
    public static String[] End_date = new String[20];
    public static float[] Hour = new float[20];
    public static float[] Rating = new float[20];
    public static float[] Day = new float[20];
    public static float total_hour = 0, total_day = 0, rat = 0;
    private static int count = 0;
    public static int i = 0;

    public void addMovie() {
        System.out.print("Enter the movie name:");
        movies[i] = scan.nextLine();

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


    public void display_movie(){
        System.out.println("==========Movie List==========\n");
        System.out.printf( "%5s|| %15s|| %20s|| %20s|| %10s||" + "", "Index", "Book Name", "Consumption(Hour)", "Consumption(Day)","Rating");
        System.out.println();

        for(int j=0;j<i;j++) {
            int k = j+1;
            System.out.format("%5s %15s %20f %20f %10f", k,movies[j],Hour[j],Day[j],Rating[j]);
            System.out.println();
        }
    }
    public void show_details(int q){
        int id=q-1;
        System.out.printf("%20s %15s %15s %18s %18s %10s", "Movie Name","Start_Date", "End_Date", "Consumption(Hour)", "Consumption(Day)","Rating");
        System.out.println();
        System.out.format("%20s %15s %15s %18s %18s %10s", movies[id],Start_date[id],End_date[id],Hour[id],Day[id],Rating[id]);
        System.out.println();
    }

}
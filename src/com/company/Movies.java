
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




}
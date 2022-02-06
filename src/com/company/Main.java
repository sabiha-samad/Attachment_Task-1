package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //     int total_hour, total_day, avg_rating, total_num;
        int choice;
        while (true) {
            Books bookObj = new Books();
            Movies movieObj = new Movies();
            Series seriesObj = new Series();
            System.out.println("============ Welcome to your entertainment Ledger===========");
            System.out.println("Select a number according to your choice:\n" +
                    "1. Add a consumable,\n" +
                    "2. Edit a consumable,\n" +
                    "3. Delete a consumable,\n" +
                    "4. See the list\n" +
                    "5. See overall info\n" +
                    "0. Quit");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();

            if (choice == 1) {
                System.out.println("Select the type of consumable you want to add:\n" +
                        "1.Books\n" +
                        "2.Series\n" +
                        "3.Movies");
                int type = scan.nextInt();

                if (type == 1) {
                    bookObj.addBook();
                }

                if (type == 2) {
                    seriesObj.addSeries();
                }

                if (type == 3) {
                    movieObj.addMovie();
                }
            }
            if (choice == 2) {
                System.out.println("Select the type you want to edit:\n" +
                        "1.Books\n" +
                        "2.Series\n" +
                        "3.Movies");
                int type = scan.nextInt();

            }


            if (choice == 3) {
                System.out.println("Select the type from which you want to delete:\n" +
                        "1.Books\n" +
                        "2.Series\n" +
                        "3.Movies");
                int type = scan.nextInt();

            }

            if (choice == 4) {
                System.out.println("Select the type from which you want to see the details:\n" +
                        "1.Books\n" +
                        "2.Series\n" +
                        "3.Movies");
                int type = scan.nextInt();

                if (type == 1) {
                    while (true) {
                        bookObj.display_book();
                        System.out.println("Select the book index to see details or enter 0 to go back: ");
                        int id = scan.nextInt();
                        if (id == 0) {
                            break;
                        } else
                            bookObj.show_details(id);
                    }

                }

              /*  if (type == 2) {
                    while (true) {
                        seriesObj.displayS();
                        System.out.println("Select the series index to see details or enter 0 to go back: ");
                        int id = scan.nextInt();
                        if (id == 0)
                            break;
                        else
                            seriesObj.show(id);
                    }
                }
                if (type == 3) {
                    while (true) {
                        movieObj.displayM();
                        System.out.println("Select the movie index to see details or enter 0 to go back :");
                        int id = scan.nextInt();
                        if (id == 0)
                            break;
                        else
                            movieObj.show(id);
                    }
                }*/
            }


            if (choice == 5) {
                System.out.println("Followings are the overall info:\n" +
                        "The total consumption time in hours across all types: \n" +
                        "Individual consumption time in hours of each type: \n" +
                        "The total days of consumption across all types: \n" +
                        "Individual days of consumption of each type: \n" +
                        "Average rating across all types: \n" +
                        "Average individual rating of each type: \n" +
                        "Total number of consumable across all types: \n" +
                        "Individual number of consumable of each type: ");

            }

            if (choice == 0) {
                break;
            }
        }


    }

    }



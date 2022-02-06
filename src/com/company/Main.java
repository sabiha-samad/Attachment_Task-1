package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
          float total_C_hour;
          float total_C_day;
          float avg_rating;
          float total_num;
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

                if (type == 2) {
                    while (true) {
                        seriesObj.display_series();
                        System.out.println("Select the series index to see details or enter 0 to go back: ");
                        int id = scan.nextInt();
                        if (id == 0)
                            break;
                        else
                            seriesObj.show_details(id);
                    }
                }
                if (type == 3) {
                    while (true) {
                        movieObj.display_movie();
                        System.out.println("Select the movie index to see details or enter 0 to go back :");
                        int id = scan.nextInt();
                        if (id == 0)
                            break;
                        else
                            movieObj.show_details(id);
                    }
                }
            }


            if (choice == 5) {
                total_C_hour = bookObj.total_hour+ seriesObj.total_hour+ movieObj.total_hour;
                total_C_day = bookObj.total_day+ seriesObj.total_day+ movieObj.total_day;

                float avg_book_rating=bookObj.rat/bookObj.i;
                float avg_series_rating = seriesObj.rat/seriesObj.i;
                float avg_movie_rating =movieObj.rat/movieObj.i;
                float rating = (avg_book_rating+avg_movie_rating+avg_series_rating)/3;

                total_num = bookObj.i + seriesObj.i + movieObj.i;

                System.out.println("Followings are the overall info:");
                System.out.println("The total consumption time in hours across all types: \n" + total_C_hour);

                System.out.println("Individual consumption time in hours of each type: " );
                System.out.println("For Books: " + bookObj.total_hour);
                System.out.println("For Series: " + seriesObj.total_hour);
                System.out.println("For Movies: " + movieObj.total_hour);

                System.out.println("The total days of consumption across all types: " + total_C_day);
                System.out.println("Individual days of consumption of each type: \n" );
                System.out.println("For Books: " + bookObj.total_day);
                System.out.println("For Series: " + seriesObj.total_hour);
                System.out.println("For movies: " + movieObj.total_hour);


                System.out.println("Average rating across all types: " + rating );
                System.out.println("Average individual rating of each type: " );
                System.out.println("For books: " + avg_book_rating);
                System.out.println("For series: " + avg_series_rating);
                System.out.println("For movies: " + avg_movie_rating );


                System.out.println("Total number of consumable across all types: " + total_num );
                System.out.println("Individual number of consumable of each type: ");
                System.out.println("For Books: " + bookObj.i);
                System.out.println("For Series: " + seriesObj.i);
                System.out.println("For Movies: " + movieObj.i);

            }

            if (choice == 0) {
                break;
            }
        }


    }

    }



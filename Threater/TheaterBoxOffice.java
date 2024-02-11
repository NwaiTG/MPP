package Threater;

import java.util.Arrays;

public class TheaterBoxOffice {
    private boolean[][] seats; // 2D array to track seat status
    private static final double TICKET_PRICE = 12.0;
    private static final double SALES_TAX_RATE = 0.05;

    public TheaterBoxOffice(int numRows, int numCols) {
        seats = new boolean[numRows][numCols]; // Initialize all seats as empty
    }

    public void showEmptySeats() {
        System.out.println("Empty Seats:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (!seats[i][j]) {
                    System.out.println("Row " + (i + 1) + ", Seat " + (j + 1));
                }
            }
        }
    }

    public void showReservedSeats() {
        System.out.println("Reserved Seats:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j]) {
                    System.out.println("Row " + (i + 1) + ", Seat " + (j + 1));
                }
            }
        }
    }

    public double reserveSeat(int row, int seat) {
        if (!seats[row - 1][seat - 1]) {
            seats[row - 1][seat - 1] = true; // Reserve the seat
            return TICKET_PRICE; // Return the ticket price
        } else {
            return 0; // Seat already reserved
        }
    }

    public void unreserveSeat(int row, int seat) {
        seats[row - 1][seat - 1] = false; // Make the seat available again
    }

    public double emptyAllSeats() {
        double totalPrice = getReservedSeatsCount() * TICKET_PRICE;
        seats = new boolean[seats.length][seats[0].length]; // Reset all seats to empty
        return totalPrice;
    }

    public double reserveAllSeats() {
        double totalPrice = getTotalSeatsCount() * TICKET_PRICE;
        for (int i = 0; i < seats.length; i++) {
            Arrays.fill(seats[i], true); // Reserve all seats
        }
        return totalPrice;
    }

    private int getReservedSeatsCount() {
        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    private int getTotalSeatsCount() {
        return seats.length * seats[0].length;
    }

    public static double calculateTotalPrice(double totalPrice) {
        return totalPrice * (1 + SALES_TAX_RATE);
    }

    public static void main(String[] args) {
        TheaterBoxOffice boxOffice = new TheaterBoxOffice(20, 28);
        double totalPrice;

        boxOffice.showEmptySeats();
        boxOffice.showReservedSeats();

        totalPrice = boxOffice.reserveSeat(2, 5);
        System.out.println("Total Price: $" + calculateTotalPrice(totalPrice));

        boxOffice.showReservedSeats();

        boxOffice.unreserveSeat(2, 5);
        System.out.println("Total Price: $" + calculateTotalPrice(totalPrice));

        totalPrice = boxOffice.emptyAllSeats();
        System.out.println("Total Price: $" + calculateTotalPrice(totalPrice));

        totalPrice = boxOffice.reserveAllSeats();
        System.out.println("Total Price: $" + calculateTotalPrice(totalPrice));
    }
}

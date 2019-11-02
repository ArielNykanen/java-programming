package com.example.awtSample;

import java.util.*;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
     int low = 0;
     int high = seats.size()-1;

     while (low <= high) {
         System.out.println(".");
         int mid = (low + high) / 2;
         Seat midVal = seats.get(mid);
         int cmp = midVal.getSeatNumber().compareTo(seatNumber);
         if(cmp < 0) {
             low = mid +1;
         }else if (cmp > 0) {
             high = mid -1;
         } else {
             return seats.get(mid).reserve();
         }
     }
        System.out.println("There is no seat " + seatNumber);
     return false;
    }

    public void getSeats() {
        for (Seat seat: seats) {
            System.out.println(seat.getSeatNumber());
        }
    }
}

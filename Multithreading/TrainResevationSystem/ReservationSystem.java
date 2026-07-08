package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReservationSystem {
    private final Map<String,Integer> availableSeats;
    private final Map<String, Lock> seatTypeLocks;

    public ReservationSystem(Map<String, Integer> availableSeats) {
        this.availableSeats = new HashMap<>(availableSeats);
        this.seatTypeLocks = new HashMap<>();
        for (String seatType : availableSeats.keySet()) {
            seatTypeLocks.put(seatType, new ReentrantLock());
        }
    }

    // Reserve seats method
    public boolean reserveSeats(String seatType, int numSeats) {
        Lock lock = seatTypeLocks.get(seatType); // get lock for seat type
        lock.lock(); // acquire lock
        try {
            int currentSeats = availableSeats.get(seatType);
            if (numSeats <= currentSeats) {
                availableSeats.put(seatType, currentSeats - numSeats); // reduce seats
                return true; // booking successful
            } else {
                return false; // not enough seats
            }
        } finally {
            lock.unlock(); // release lock always
        }
    }

    // Get available seats for a seat type
    public int getAvailableSeats(String seatType) {
        return availableSeats.get(seatType);
    }
}

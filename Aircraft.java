
package flightreservations;

/*
 *
 * This class models an aircraft type with a model name, a maximum number of economy seats, and a max number of forst class seats
 *
 * Add code such that class Aircraft implements the Comparable interface
 * Compare two Aircraft objects by first comparing the number of economy seats. If the number is equal, then compare the
 * number of first class seats
 */
public class Aircraft implements Comparable<Aircraft> {
    int numEconomySeats;
    int numFirstClassSeats;

    String model;

    public Aircraft(int seats, String model) {
        this.numEconomySeats = seats;
        this.numFirstClassSeats = 0;
        this.model = model;
    }

    public Aircraft(int economy, int firstClass, String model) {
        this.numEconomySeats = economy;
        this.numFirstClassSeats = firstClass;
        this.model = model;
    }

    public int getNumSeats() {
        return numEconomySeats;
    }

    public int getTotalSeats() {
        return numEconomySeats + numFirstClassSeats;
    }

    public int getNumFirstClassSeats() {
        return numFirstClassSeats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void print() {
        System.out.println("Model: " + model + "\t Economy Seats: " + numEconomySeats + "\t First Class Seats: " + numFirstClassSeats);
    }


    /*
     * Write a compareTo method that is part of the Comparable interface
     */
    @Override
    public int compareTo(Aircraft o) {
        //the compareto method allows to compare two aircrafts by their capacities
        if (this.numEconomySeats > o.getNumSeats()) {
            return 1;
        } else if (this.numEconomySeats < o.getNumSeats()) {
            return -1;
        } else if (this.numEconomySeats == o.getNumSeats()) {
            return Integer.compare(this.numFirstClassSeats, o.getNumFirstClassSeats());
        }
        return 0;
    }
}
  

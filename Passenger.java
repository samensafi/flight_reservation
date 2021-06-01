// Sam Ensafi - 501015750
package flightreservations;

public class Passenger {

    String name;
    int passportNumber;
    int seatNumber;

    public Passenger(String name, int passportNumber, int seatNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.seatNumber = seatNumber;
    }

    public String getName() {//this method lets you get the name of a passenger
        return name;
    }

    public void setName(String name) {//this method lets you set a name for this passenger
        this.name = name;
    }

    public int getPassportNumber() {//this method lets you get the passport number of a passenger
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {//this method lets you set a passport number for this passenger
        this.passportNumber = passportNumber;
    }

    public int getSeatNumber() {//this method lets you get the seat number of a passenger
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {//this method lets you set a seat number for this passenger
        this.seatNumber = seatNumber;
    }


    @Override
    public boolean equals(Object obj) {
        //if a passenger's name and passport number equal those of another, we return true. If they are not, we return false
        return ((((Passenger) obj).name.equals(this.name))
                &&
                ((((Passenger) obj).passportNumber == this.passportNumber)));
    }

    @Override
    public String toString() {// we return a string version of this object in the following format
        return "name:  " + name + " passportNumber:  " + passportNumber + " seatNumber:  " + seatNumber;
    }
}

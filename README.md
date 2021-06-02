## flight_reservation
This is a Flight Reservation Simulator program.

The class Flight, models an airline flight departing Toronto and flying to several cities. Every flight has a specific identifier. For example, "AC314" is for Air Canada flight 314.

The class Aircraft, models an aircraft type such as "Boeing 747" and contains information about the model name and the seats.

The class Reservation, models a simple electronic reservation containing flight information, and whether the reservation is for a first-class seat.

The class FlightManager, maintains an array list of Flight objects.

The class FlightReservationSystem, has the main() method and is the user interaction part.

The class LongHaulFlight, is a subclass of class Flight which models a long flight to a far-away destination. Long haul flights usually have different classes of seats such as first class, business, and economy. It also overrides inherited methods reserveSeat() and cancelSeat(), and has them call new methods.

The class Passenger, contains a name, passport number, and a seat number field. It also, ensures that there are no duplicate passengers when reserving a seat and contains methods to add new commands to other classes.

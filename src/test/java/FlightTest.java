import com.codeclan.Airport;
import com.codeclan.Flight;
import com.codeclan.people.Passenger;
import com.codeclan.people.crew.CabinCrewMember;
import com.codeclan.people.crew.Pilot;
import com.codeclan.people.crew.Rank;
import com.codeclan.planes.Plane;
import com.codeclan.planes.PlaneType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class FlightTest {
    Flight flight;
    Pilot pilot;
    Plane plane;
    Passenger passenger;
    CabinCrewMember cabinCrewMember;
    @Before
    public void before(){
        pilot = new Pilot("Pauline", Rank.CAPTAIN,"PI2394");
        passenger = new Passenger("Taylor", 2);
        plane = new Plane(PlaneType.TINYPLANE);
        cabinCrewMember = new CabinCrewMember("Roy", Rank.FLIGHTATTENDENT);
        flight = new Flight(plane, "FL234", Airport.EDINBURGH, Airport.MANCHESTER, "24/09/2023, 15:00");
    }
    @Test
    public void canAddPilot(){
        flight.addPilot(pilot);
        assertEquals(1,flight.getNumberOfPilots());
    }

    @Test
    public void canAddCabinCrewMember(){
        flight.addCabinCrewMember(cabinCrewMember);
        assertEquals(1, flight.getNumberOfCabinCrewMembers());
    }
    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.getNumberOfPassengers());
    }
    @Test
    public void canGetPlane(){
        assertEquals(plane, flight.getPlane());
    }
    @Test
    public void canGetFlightNumber(){
        assertEquals("FL234", flight.getFlightNumber());
    }
    @Test
    public void canGetDestinationTo(){
        assertEquals(Airport.EDINBURGH, flight.getDestinationTo());
    }
    @Test
    public void canGetDepartureFrom(){
        assertEquals(Airport.MANCHESTER, flight.getDepartureFrom());
    }
    @Test
    public void canGetDepartureTime(){
        assertEquals("24/09/2023, 15:00", flight.getDepartureTime());
    }
    @Test
    public void canReturnAvailableSeats(){
        assertEquals(5, flight.getAvailableSeats());
        flight.addPassenger(passenger); //should go down when adding a passenger
        assertEquals(4, flight.getAvailableSeats());
    }
    @Test
    public void shouldNotBeAbleToBookBeyondCapacity(){
        for (int i=0; i<7; i++) {
            flight.addPassenger(passenger);
        }
        assertEquals(5, flight.getNumberOfPassengers());
    }

}

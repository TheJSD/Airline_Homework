package people.staff;
import com.codeclan.people.crew.Pilot;
import com.codeclan.people.crew.Rank;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PilotTest {
    Pilot pilot;
    @Before
    public void before(){
        pilot = new Pilot("Pauline",Rank.CAPTAIN,"PI2394");
    }

    @Test
    public void canGetName() {
        assertEquals("Pauline",pilot.getName());
    }

    @Test
    public void canGetRank() {
        assertEquals(Rank.CAPTAIN,pilot.getRank());
    }
    @Test
    public void canGetPilotNumber(){
        assertEquals("PI2394", pilot.getPilotLicenceNumber());
    }
}

package people.staff;
import com.codeclan.people.crew.CabinCrewMember;
import com.codeclan.people.crew.Rank;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;
    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Roy", Rank.FLIGHTATTENDENT);
    }
    @Test
    public void hasRank(){
        assertEquals(Rank.FLIGHTATTENDENT,cabinCrewMember.getRank());
    }
    @Test
    public void canMakeAnnouncement(){
        assertEquals("Attention Passengers",cabinCrewMember.makeAnnouncement("Attention Passengers"));
    }
}

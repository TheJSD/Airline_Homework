import com.codeclan.planes.Plane;
import com.codeclan.planes.PlaneType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PlaneTest {
    Plane plane;
    @Before
    public void before(){
        plane = new Plane(PlaneType.TINYPLANE);
    }
    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.TINYPLANE, plane.getPlaneType());
    }
    @Test
    public void canGetCapacity(){
        assertEquals(5,plane.getCapacity());
    }
    @Test
    public void getTotalWeight(){
        assertEquals(30,plane.getTotalWeight());
    }
}

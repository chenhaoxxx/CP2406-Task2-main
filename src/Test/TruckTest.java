package Test;

import Model.Road;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TruckTest {
    Model.Road road = new Model.Road("0", 1, 5, new int[]{0, 0}, Road.Orientation.VERTICAL);
    Model.Truck truck = new Model.Truck("0", road);

    @Test
    void getLength() {
        assertEquals(16, truck.getLength());
    }

    @Test
    void getId() {
        assertEquals("truck_0", truck.getId());
    }

    @Test
    void testInheritance() {
        assertEquals(0, truck.getSpeed());
        assertEquals(-16, truck.getPosition());
    }
}
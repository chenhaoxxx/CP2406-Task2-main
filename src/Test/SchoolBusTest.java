package Test;

import Model.Road;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SchoolBusTest {
    Model.Road road = new Model.Road("0", 1, 5, new int[]{0, 0}, Road.Orientation.VERTICAL);
    Model.SchoolBus schoolbus = new Model.SchoolBus("0", road);

    @Test
    void getLength() {
        assertEquals(12, schoolbus.getLength());
    }

    @Test
    void getId() {
        assertEquals("SchoolBus_0", schoolbus.getId());
    }

    @Test
    void testInheritance() {
        assertEquals(0, schoolbus.getSpeed());
        assertEquals(-12, schoolbus.getPosition());
    }
}
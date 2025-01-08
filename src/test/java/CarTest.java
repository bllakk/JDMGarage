import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    public void testRemoveCar(){
        Garage libertyWalk = new Garage("LibertyWalk", 2);
        Engine combustion = new Engine("Combustion", 150);

        Car Civic = new Car("Civic", "Honda", 1994, combustion);
        Car Rx7 = new Car("RX-7", "Mazda", 1993, combustion);

        libertyWalk.addCar(Civic);
        libertyWalk.addCar(Rx7);

        assertTrue(libertyWalk.listGarage.contains(Civic));

        libertyWalk.removeCar(Civic);

        assertFalse(libertyWalk.listGarage.contains(Civic));

    }

}
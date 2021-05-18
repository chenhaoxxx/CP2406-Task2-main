package Model;

public class Truck extends Vehicle {

    public Truck(String id, Road currentRoad) {
        super(currentRoad);
        this.id = ("truck_" + id);
        setLength(super.getLength() * 4);
        position = -length;
    }
}

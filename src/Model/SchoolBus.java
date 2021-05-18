package Model;

public class SchoolBus extends Vehicle{

    public SchoolBus(String id, Road currentRoad) {
        super(currentRoad);
        this.id = ("SchoolBus_" + id);
        setLength(super.getLength() * 3);
        position = -length;
    }
}

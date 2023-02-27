public enum ShipType {
    CARRIER(1), BATTLESHIP(3), SUBMARINE(4), CRUISER(2), DESTROYER(5);

    private final int size;

    ShipType(int size) {  //ez a konstruktor
        this.size = size;
    }
}

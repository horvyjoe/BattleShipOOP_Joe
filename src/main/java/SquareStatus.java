public enum SquareStatus {
    EMPTY('0'), SHIP('X'), HIT('H'), MISSED('M'), SUNK('S');   //amíg nincs értéke az ENUM-nak, nem kell a végére pontosvessző

    private final char status;

    SquareStatus(char status) {
        this.status = status;
    }

    public char getStatus() {
        return status;
    }
}

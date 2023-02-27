class Square {

    private SquareStatus status;

    public Square(SquareStatus status) {
        this.status = status;
    }
    char getStatus() {
       return status.getStatus(); //azt a karaktert kapom vissza amita státusza mond

    }
}

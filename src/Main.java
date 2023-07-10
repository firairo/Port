import boxes.Box;
import decks.Deck;
import ships.Ship;

public class Main {
    public static void main(String[] args) {

        Box smallBox = new Box(10, 10, 10, 1000, false);
        Box bigBox = new Box(40, 40, 40, 1600, true);

        Deck deckWithSmallContainers = new Deck(1, smallBox, smallBox, smallBox, smallBox, smallBox);
        Deck deckWithBigContainers = new Deck(2, bigBox, bigBox, bigBox, bigBox, bigBox);

        Port port = new Port();
        port.addShip(new Ship("Titanic", 2, deckWithBigContainers));
        port.addShip(new Ship("Kursk", 1, deckWithSmallContainers));
        port.addShip(new Ship("Tortuga", 2, deckWithBigContainers));

        //port.removeShip();
        port.getAllShipsName();
        System.out.println(port.getMassAllShips());
    }
}
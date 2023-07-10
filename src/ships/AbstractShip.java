package ships;

import decks.Deck;

abstract public class AbstractShip {
    public String name;
    public Integer quantityDeck; // 1 or 2
    public Deck deck;
}
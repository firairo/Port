package ships;

import decks.Deck;

public class Ship extends AbstractShip {

    public Ship(String name, Integer quantityDeck, Deck deck) {
        this.name = name;
        this.quantityDeck = quantityDeck;
        this.deck = deck;
    }
}

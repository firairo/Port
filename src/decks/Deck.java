package decks;

import boxes.Box;

import java.util.ArrayList;

public class Deck extends AbstractDeck implements getVolumeDeck {
    public ArrayList<Box> boxes = new ArrayList<>();

    public Deck(Integer deck, Box box1, Box box2) {
        this.deck = deck;
        boxes.add(box1);
        boxes.add(box2);
    }

    public Deck(Integer deck, Box box1, Box box2, Box box3, Box box4, Box box5) {
        this.deck = deck;
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
        boxes.add(box4);
        boxes.add(box5);
    }

    @Override
    public Integer getVolumeDeck() {
        Integer volumeDeck = 0;
        for (int i = 0; i < 1; i++) {
            volumeDeck = volumeDeck + boxes.get(i).wight * boxes.get(i).height * boxes.get(i).length * boxes.get(i).density * deck;
        }
        return volumeDeck;
    }
}

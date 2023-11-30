package Model;

public class Card {
    private int value;
    private String suit;

    public card(int value, String suit){
        this.value = value;
        this.suit = suit;
    }
    public Card(){
        this(0,"");
    }
    public int getValue(){
        return value;
    }
    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "Suit: " +suit+"" + value + '}';
    }
}


// Name: [Nestor Juarez]
// Date: [06/18/25]
// Program: Card.java - Defines a Card object with suit, name, value, and picture.

package cardGame;

public class Card {
    private String suit;
    private String name;
    private int value;
    private String picture;

    // Constructor
    public Card(String suit, String name, int value, String picture) {
        this.suit = suit;
        this.name = name;
        this.value = value;
        this.picture = picture;
    }

    // Accessors (getters)
    public String getSuit() { return suit; }
    public String getName() { return name; }
    public int getValue() { return value; }
    public String getPicture() { return picture; }

    // Mutators (setters)
    public void setSuit(String suit) { this.suit = suit; }
    public void setName(String name) { this.name = name; }
    public void setValue(int value) { this.value = value; }
    public void setPicture(String picture) { this.picture = picture; }

    // Override equals() to compare cards by name and suit
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Card)) return false;

        Card other = (Card) obj;
        return this.name.equals(other.name) && this.suit.equals(other.suit);
    }

    // toString method
    @Override
    public String toString() {
        return name + " of " + suit + " (Value: " + value + ")";
    }
}

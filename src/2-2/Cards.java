import java.io.*;
import java.util.Random;

enum Rank {
    Ace, Nr2, Nr3, Nr4, Nr5, Nr6, Nr7, Nr8, Nr9, Nr10, Jack, Queen, King
}

enum Color {
    Clubs, Diamonds, Hearts, Spades
}

// Polskie kolorki:
// enum Color {
// Pik, Karo, Kier, Trefl
// }

class Card {
    private Rank rank;
    private Color color;

    public Card(Rank rank, Color color) {
        this.setRank(rank);
        this.setColor(color);
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Rank getRank() {
        return this.rank;
    }

    public Color getColor() {
        return this.color;
    }

    public String toString() {
        return String.format("Rank: %s, Color: %s", this.rank, this.color);
    }
}

class CardTest {
    public static Rank pickRandomRank() {
        return Rank.values()[new Random().nextInt(Rank.values().length)];
    }

    public static Color pickRandomColor() {
        return Color.values()[new Random().nextInt(Color.values().length)];
    }

    public static void main(String[] args) throws IOException {
        Card[] cards = new Card[3];

        for (Card card : cards) {
            card = new Card(pickRandomRank(), pickRandomColor());
            System.out.println(card.toString());
        }
    }
}

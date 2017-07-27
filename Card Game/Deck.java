public class Deck {

    public Card[] getDeck() {
        Card cards[] = {
                new Card(Rank.ONE, Suit.HEARTS),
                new Card(Rank.TWO, Suit.HEARTS),
                new Card(Rank.THREE, Suit.HEARTS),
                new Card(Rank.FOUR, Suit.HEARTS)
        };
        return cards;
    }

}
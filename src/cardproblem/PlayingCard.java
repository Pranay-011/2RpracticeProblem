/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Aug-20
 *  Time: 12:07 PM
 */

/*
Write a class whose instances represent a single playing card from a deck of cards(52 cards).
Playing cards have two distinguishing  properties: rank and suit
(spade, club, heart, Diamond).
 */

package cardproblem;

public class PlayingCard {
    private int rank;
    private String suit;

    public PlayingCard(int rank, String suit) {
        this.rank = rank; // this keyword will refer to the current object.
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
}

/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Aug-20
 *  Time: 12:18 PM
 */
package cardproblem;

public class PlayingCardMain {
    public static void main(String[] args) {
        PlayingCard card = new PlayingCard(13, "spade");
        System.out.println(card.getRank());
        System.out.println(card.getSuit());
    }
}

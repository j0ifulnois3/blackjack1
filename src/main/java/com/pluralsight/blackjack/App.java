package com.pluralsight.blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand hand1 = new Hand();
        // deal 5 cards
        for (int i = 0; i < 5; i++) {
            // get a card from the deck
            Card card = deck.deal();
            // deal that card to the hand
            hand1.deal(card);
        }
        int handValue = hand1.getValue();
        System.out.println("This hand is worth " + handValue);


        Scanner scanner = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();
        System.out.print("Enter All Player Names (Ex. Jessica, Nick, Schmidt, Winston, CeCe)");
        String input = scanner.next();
        String[] names = input.split(",");

    }
}
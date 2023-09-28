/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Fill magicHand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1); // Random card value between 1 and 13
            c.setSuit(Card.SUITS[random.nextInt(4)]); // Random suit from Card.SUITS array
            magicHand[i] = c;
        }

        // Ask the user for a card value and suit
        System.out.print("Enter a card value (1-13): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int userSuit = scanner.nextInt();

        // Hard-coded lucky card
Card luckyCard = new Card();
luckyCard.setValue(7); // You can choose any card value
luckyCard.setSuit("Hearts"); // You can choose any suit

        
        // Create the user's card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);

        // Search magicHand for the user's card
        boolean cardFound = false;
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                cardFound = true;
                break;
            }
        }

        // Report the result
        if (cardFound) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }

        // Close the scanner
        scanner.close();
    }
}

        // add one luckcard hard code 2,clubs
   

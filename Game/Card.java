/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author ibad_
 */
public class Card {
    private String faceName; //Spades, Hearts, Diamonds, Clubs
    private String suitName; // Ace, Two, Three, Four,Five,Six,Seven,Eight,Nine,Jack,Queen,King
    private int faceValue; // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    private BufferedImage cardImage; // Image of each card.
    
    // Now create a Construction, this will take the above parametrs
    public Card(String face, String suit, int value, BufferedImage card) {
        this.faceName = face;
        this.suitName = suit;
        this.faceValue = value;
        this.cardImage = card;
     
    }


    
   
    public String toString() {
        return faceName + " of " + suitName;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public BufferedImage getCardImage() {
        return cardImage;
    }
    
    Card() throws IOException {
       aceOfSpades = new Card("Spades", "Ace", 1, ImageIO.read(new File("src/image/card/1.png")));
    }
 
}

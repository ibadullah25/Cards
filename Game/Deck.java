package Game;

import java.awt.*;
import javax.swing.*;

import java.io.IOException;

// to read card images
import java.io.File;
import javax.imageio.ImageIO;

// to add cards to array and shuffle 
import java.util.ArrayList;
import java.util.Collections;

public class Deck  {
      public static void main(String[] args) throws IOException {

        // All Spades Cards
        Card aceOfSpades = new Card("Spades", "Ace", 1, ImageIO.read(new File("src/image/card/1.png")));
        Card twoOfSpades = new Card("Spades", "Two", 2, ImageIO.read(new File("src/image/card/2.png")));
        Card threeOfSpades = new Card("Spades", "Three", 3, ImageIO.read(new File("src/image/card/3.png")));
        Card fourOfSpades = new Card("Spades", "Four", 4, ImageIO.read(new File("src/image/card/4.png")));
        Card fiveOfSpades = new Card("Spades", "Five", 5, ImageIO.read(new File("src/image/card/5.png")));
        Card sixOfSpades = new Card("Spades", "Six", 6, ImageIO.read(new File("src/image/card/6.png")));
        Card sevenOfSpades = new Card("Spades", "Seven", 7, ImageIO.read(new File("src/image/card/7.png")));
        Card eightOfSpades = new Card("Spades", "Eight", 8, ImageIO.read(new File("src/image/card/8.png"))); 
        Card nineOfSpades = new Card("Spades", "Nine", 9, ImageIO.read(new File("src/image/card/9.png")));
        Card jackOfSpades = new Card("Spades", "Jack", 10, ImageIO.read(new File("src/image/card/10.png")));
        Card queenOfSpades = new Card("Spades", "Queen", 10, ImageIO.read(new File("src/image/card/11.png")));
        Card kingOfSpades = new Card("Spades", "King", 1, ImageIO.read(new File("src/image/card/12.png")));

        // All Hearts
        Card aceOfHearts = new Card("Hearts", "Ace", 1, ImageIO.read(new File("src/image/card/13.png")));
        Card twoOfHearts = new Card("Hearts", "Two", 2, ImageIO.read(new File("src/image/card/14.png")));
        Card threeOfHearts = new Card("Hearts", "Three", 3, ImageIO.read(new File("src/image/card/15.png")));
        Card fourOfHearts = new Card("Hearts", "Four", 4, ImageIO.read(new File("src/image/card/16.png")));
        Card fiveOfHearts = new Card("Hearts", "Five", 5, ImageIO.read(new File("src/image/card/17.png")));
        Card sixOfHearts = new Card("Hearts", "Six", 6, ImageIO.read(new File("src/image/card/18.png")));
        Card sevenOfHearts = new Card("Hearts", "Seven", 7, ImageIO.read(new File("src/image/card/19.png")));
        Card eightOfHearts = new Card("Hearts", "Eight", 8, ImageIO.read(new File("src/image/card/20.png")));
        Card nineOfHearts = new Card("Hearts", "Nine", 9, ImageIO.read(new File("src/image/card/21.png")));

        Card jackOfHearts = new Card("Hearts", "Jack", 10, ImageIO.read(new File("src/image/card/22.png")));
        Card queenOfHearts = new Card("Hearts", "Queen", 10, ImageIO.read(new File("src/image/card/23.png")));
        Card kingOfHearts = new Card("Hearts", "King", 1, ImageIO.read(new File("src/image/card/24.png")));

        // All Diamonds
        Card aceOfDiamonds = new Card("Diamonds", "Ace", 1, ImageIO.read(new File("src/image/card/25.png")));
        Card twoOfDiamonds = new Card("Diamonds", "Two", 2, ImageIO.read(new File("src/image/card/26.png")));
        Card threeOfDiamonds = new Card("Diamonds", "Three", 3, ImageIO.read(new File("src/image/card/27.png")));
        Card fourOfDiamonds = new Card("Diamonds", "Four", 4, ImageIO.read(new File("src/image/card/28.png")));
        Card fiveOfDiamonds = new Card("Diamonds", "Five", 5, ImageIO.read(new File("src/image/card/29.png")));
        Card sixOfDiamonds = new Card("Diamonds", "Six", 6, ImageIO.read(new File("src/image/card/30.png")));
        Card sevenOfDiamonds = new Card("Diamonds", "Seven", 7, ImageIO.read(new File("src/image/card/31.png")));
        Card eightOfDiamonds = new Card("Diamonds", "Eight", 8, ImageIO.read(new File("src/image/card/32.png")));
        Card nineOfDiamonds = new Card("Diamonds", "Nine", 9, ImageIO.read(new File("src/image/card/33.png")));

        Card jackOfDiamonds = new Card("Diamonds", "Jack", 10, ImageIO.read(new File("src/image/card/34.png")));
        Card queenOfDiamonds = new Card("Diamonds", "Queen", 10, ImageIO.read(new File("src/image/card/35.png")));
        Card kingOfDiamonds = new Card("Diamonds", "King", 1, ImageIO.read(new File("src/image/card/36.png")));

        // All Club Card
        Card aceOfClubs = new Card("Clubs", "Ace", 1, ImageIO.read(new File("src/image/card/37.png")));
        Card twoOfClubs = new Card("Clubs", "Two", 2, ImageIO.read(new File("src/image/card/38.png")));
        Card threeOfClubs = new Card("Clubs", "Three", 3, ImageIO.read(new File("src/image/card/39.png")));
        Card fourOfClubs = new Card("Clubs", "Four", 4, ImageIO.read(new File("src/image/card/40.png")));
        Card fiveOfClubs = new Card("Clubs", "Five", 5, ImageIO.read(new File("src/image/card/41.png")));
        Card sixOfClubs = new Card("Clubs", "Six", 6, ImageIO.read(new File("src/image/card/42.png")));
        Card sevenOfClubs = new Card("Clubs", "Seven", 7, ImageIO.read(new File("src/image/card/43.png")));
        Card eightOfClubs = new Card("Clubs", "Eight", 8, ImageIO.read(new File("src/image/card/44.png")));
        Card nineOfClubs = new Card("Clubs", "Nine", 9, ImageIO.read(new File("src/image/card/45.png")));
        Card jackOfClubs = new Card("Clubs", "Jack", 10, ImageIO.read(new File("src/image/card/46.png")));
        Card queenOfClubs = new Card("Clubs", "Queen", 10, ImageIO.read(new File("src/image/card/47.png")));
        Card kingOfClubs = new Card("Clubs", "King", 1, ImageIO.read(new File("src/image/card/48.png")));



        //move obj = new move();
        
        JFrame frame = new JFrame("Get Stuck Card Game");
        JPanel panel = new JPanel(new GridBagLayout());
        frame.getContentPane().addMouseListener(new move());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.NORTH);
        frame.setAlwaysOnTop(true);
        

        
        // Put the labels inside the panel
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(20, 5, 5, 5);
        c.ipady = 2;
        c.fill = GridBagConstraints.BOTH;
        

        //define ArrayList to hold Integer objects
        ArrayList<Integer> numbers = new ArrayList<>();
        
        for (int i = 0; i < 49; i++) {
            numbers.add(i + 1);
        }
        
        Collections.shuffle(numbers);
        
        //System.out.println(numbers);     
    

        for (int j = 0; j < 49; j++) {
            if (numbers.get(j) == 1) {
                //System.out.println(numbers.get(j));
                JLabel ace1 = new JLabel(new ImageIcon(aceOfSpades.getCardImage()));
                c.gridx = 0;
                c.gridy = 0;   
                panel.add(ace1, c);
            }

            if (numbers.get(j) == 2) {
                JLabel spades2 = new JLabel(new ImageIcon(twoOfSpades.getCardImage()));
                c.gridx = 1;
                c.gridy = 0;
                panel.add(spades2, c);
            }

            if (numbers.get(j) == 3) {
                JLabel spades3 = new JLabel(new ImageIcon(threeOfSpades.getCardImage()));
                c.gridx = 2;
                c.gridy = 0;
                panel.add(spades3, c);
            }

            if (numbers.get(j) == 4) {
                JLabel spades4 = new JLabel(new ImageIcon(fourOfSpades.getCardImage()));
                c.gridx = 3;
                c.gridy = 0;
                panel.add(spades4, c);
            }

            if (numbers.get(j) == 5) {
                JLabel spades5 = new JLabel(new ImageIcon(fiveOfSpades.getCardImage()));
                c.gridx = 4;
                c.gridy = 0;
                panel.add(spades5, c);
            }

            if (numbers.get(j) == 6) {
                JLabel spades6 = new JLabel(new ImageIcon(sixOfSpades.getCardImage()));
                c.gridx = 5;
                c.gridy = 0;
                panel.add(spades6, c);
            }

            if (numbers.get(j) == 7) {
                JLabel spades7 = new JLabel(new ImageIcon(sevenOfSpades.getCardImage()));
                c.gridx = 6;
                c.gridy = 0;
                panel.add(spades7, c);
            }

            if (numbers.get(j) == 8) {
                JLabel spades8 = new JLabel(new ImageIcon(eightOfSpades.getCardImage()));
                c.gridx = 0;
                c.gridy = 1;
                panel.add(spades8, c);
            }
            if (numbers.get(j) == 9) {
                JLabel spades9 = new JLabel(new ImageIcon(nineOfSpades.getCardImage()));
                c.gridx = 1;
                c.gridy = 1;
                panel.add(spades9, c);
            }
            if (numbers.get(j) == 10) {
                JLabel spadesJ = new JLabel(new ImageIcon(jackOfSpades.getCardImage()));
                c.gridx = 2;
                c.gridy = 1;
                panel.add(spadesJ, c);
            }
            if (numbers.get(j) == 11) {
                JLabel spadesQ = new JLabel(new ImageIcon(queenOfSpades.getCardImage()));
                c.gridx = 3;
                c.gridy = 1;
                panel.add(spadesQ, c);
            }
            if (numbers.get(j) == 12) {
                JLabel spadesK = new JLabel(new ImageIcon(kingOfSpades.getCardImage()));
                c.gridx = 4;
                c.gridy = 1;
                panel.add(spadesK, c);
            }

            if (numbers.get(j) == 13) {
                JLabel ace2 = new JLabel(new ImageIcon(aceOfHearts.getCardImage()));
                c.gridx = 5;
                c.gridy = 1;
                panel.add(ace2, c);
            }
            if (numbers.get(j) == 14) {
                JLabel hearts2 = new JLabel(new ImageIcon(twoOfHearts.getCardImage()));
                c.gridx = 6;
                c.gridy = 1;
                panel.add(hearts2, c);
            }
            if (numbers.get(j) == 15) {
                JLabel hearts3 = new JLabel(new ImageIcon(threeOfHearts.getCardImage()));
                c.gridx = 0;
                c.gridy = 2;
                panel.add(hearts3, c);
            }
            if (numbers.get(j) == 16) {
                JLabel hearts4 = new JLabel(new ImageIcon(fourOfHearts.getCardImage()));
                c.gridx = 1;
                c.gridy = 2;
                panel.add(hearts4, c);
            }
            if (numbers.get(j) == 17) {
                JLabel hearts5 = new JLabel(new ImageIcon(fiveOfHearts.getCardImage()));
                c.gridx = 2;
                c.gridy = 2;                
                panel.add(hearts5, c);
            }
            if (numbers.get(j) == 18) {
                JLabel hearts6 = new JLabel(new ImageIcon(sixOfHearts.getCardImage()));
                c.gridx = 3;
                c.gridy = 2;
                panel.add(hearts6, c);
            }
            if (numbers.get(j) == 19) {
                JLabel hearts7 = new JLabel(new ImageIcon(sevenOfHearts.getCardImage()));
                c.gridx = 4;
                c.gridy = 2;
                panel.add(hearts7, c);
            }
            if (numbers.get(j) == 20) {
                JLabel hearts8 = new JLabel(new ImageIcon(eightOfHearts.getCardImage()));
                c.gridx = 5;
                c.gridy = 2;
                panel.add(hearts8, c);
            }

            if (numbers.get(j) == 21) {
                JLabel hearts9 = new JLabel(new ImageIcon(nineOfHearts.getCardImage()));
                c.gridx = 6;
                c.gridy = 2;
                panel.add(hearts9, c);
            }

            if (numbers.get(j) == 22) {
                JLabel heartsJ = new JLabel(new ImageIcon(jackOfHearts.getCardImage()));
                c.gridx = 0;
                c.gridy = 3;
                panel.add(heartsJ, c);
            }

            if (numbers.get(j) == 23) {
                JLabel heartsQ = new JLabel(new ImageIcon(queenOfHearts.getCardImage()));
                c.gridx = 1;
                c.gridy = 3;
                panel.add(heartsQ, c);
            }
            if (numbers.get(j) == 24) {
                JLabel heartsK = new JLabel(new ImageIcon(kingOfHearts.getCardImage()));
                c.gridx = 2;
                c.gridy = 3;
                panel.add(heartsK, c);
            }
            if (numbers.get(j) == 25) {
              //  JLabel ace3 = new JLabel(new ImageIcon(aceOfDiamonds.getCardImage()));
                c.gridx = 3;
                c.gridy = 3;
              //  panel.add(ace3, c);
            }
            if (numbers.get(j) == 49 ){
                JLabel ace3 = new JLabel(new ImageIcon(aceOfDiamonds.getCardImage()));
                c.gridx = 6;
                c.gridy = 6;
                panel.add(ace3, c);

            }
            if (numbers.get(j) == 26) {
                JLabel diamonds2 = new JLabel(new ImageIcon(twoOfDiamonds.getCardImage()));
                c.gridx = 4;
                c.gridy = 3;
                panel.add(diamonds2, c);
            }
            if (numbers.get(j) == 27) {
                JLabel diamonds3 = new JLabel(new ImageIcon(threeOfDiamonds.getCardImage()));
                c.gridx = 5;
                c.gridy = 3;
                panel.add(diamonds3, c);
            }
            if (numbers.get(j) == 28) {
                JLabel diamonds4 = new JLabel(new ImageIcon(fourOfDiamonds.getCardImage()));
                c.gridx = 6;
                c.gridy = 3;
                panel.add(diamonds4, c);
            }
            if (numbers.get(j) == 29) {
                JLabel diamonds5 = new JLabel(new ImageIcon(fiveOfDiamonds.getCardImage()));
                c.gridx = 0;
                c.gridy = 4;
                panel.add(diamonds5, c);

            }
            if (numbers.get(j) == 30) {
                JLabel diamonds6 = new JLabel(new ImageIcon(sixOfDiamonds.getCardImage()));
                c.gridx = 1;
                c.gridy = 4;
                panel.add(diamonds6, c);
            }
            if (numbers.get(j) == 31) {
                JLabel diamonds7 = new JLabel(new ImageIcon(sevenOfDiamonds.getCardImage()));
                c.gridx = 2;
                c.gridy = 4;
                panel.add(diamonds7, c);
            }
            if (numbers.get(j) == 32) {
                JLabel diamonds8 = new JLabel(new ImageIcon(eightOfDiamonds.getCardImage()));
                c.gridx = 3;
                c.gridy = 4;
                panel.add(diamonds8, c);
            }
            if (numbers.get(j) == 33) {
                JLabel diamonds9 = new JLabel(new ImageIcon(nineOfDiamonds.getCardImage()));
                c.gridx = 4;
                c.gridy = 4;
                panel.add(diamonds9, c);
            }
            if (numbers.get(j) == 34) {
                JLabel diamondsJ = new JLabel(new ImageIcon(jackOfDiamonds.getCardImage()));
                c.gridx = 5;
                c.gridy = 4;
                panel.add(diamondsJ, c);
            }
            if (numbers.get(j) == 35) {
                JLabel diamondsQ = new JLabel(new ImageIcon(queenOfDiamonds.getCardImage()));
                c.gridx = 6;
                c.gridy = 4;
                panel.add(diamondsQ, c);
            }
            if (numbers.get(j) == 36) {
                JLabel diamondsK = new JLabel(new ImageIcon(kingOfDiamonds.getCardImage()));
                c.gridx = 0;
                c.gridy = 5;
                panel.add(diamondsK, c);
            }
            if (numbers.get(j) == 37) {
                JLabel ace4 = new JLabel(new ImageIcon(aceOfClubs.getCardImage()));
                c.gridx = 1;
                c.gridy = 5;
                panel.add(ace4, c);
            }
            if (numbers.get(j) == 38) {
                JLabel clubs2 = new JLabel(new ImageIcon(twoOfClubs.getCardImage()));
                c.gridx = 2;
                c.gridy = 5;
                panel.add(clubs2, c);
            }
            if (numbers.get(j) == 39) {
                JLabel clubs3 = new JLabel(new ImageIcon(threeOfClubs.getCardImage()));
                c.gridx = 3;
                c.gridy = 5;
                panel.add(clubs3, c);
            }
            if (numbers.get(j) == 40) {
                JLabel clubs4 = new JLabel(new ImageIcon(fourOfClubs.getCardImage()));
                c.gridx = 4;
                c.gridy = 5;
                panel.add(clubs4, c);
            }
            if (numbers.get(j) == 41) {
                JLabel clubs5 = new JLabel(new ImageIcon(fiveOfClubs.getCardImage()));
                c.gridx = 5;
                c.gridy = 5;
                panel.add(clubs5, c);
            }
            if (numbers.get(j) == 42) {
                JLabel clubs6 = new JLabel(new ImageIcon(sixOfClubs.getCardImage()));
                c.gridx = 6;
                c.gridy = 5;
                panel.add(clubs6, c);
            }
            if (numbers.get(j) == 43) {
                JLabel clubs7 = new JLabel(new ImageIcon(sevenOfClubs.getCardImage()));
                c.gridx = 0;
                c.gridy = 6;
                panel.add(clubs7, c);
            }
            if (numbers.get(j) == 44) {
                JLabel clubs8 = new JLabel(new ImageIcon(eightOfClubs.getCardImage()));
                c.gridx = 1;
                c.gridy = 6;
                panel.add(clubs8, c);
            }
            if (numbers.get(j) == 45) {
                JLabel clubs9 = new JLabel(new ImageIcon(nineOfClubs.getCardImage()));
                c.gridx = 2;
                c.gridy = 6;
                panel.add(clubs9, c);
            }
            if (numbers.get(j) == 46) {
                JLabel clubsJ = new JLabel(new ImageIcon(jackOfClubs.getCardImage()));
                c.gridx = 3;
                c.gridy = 6;
                panel.add(clubsJ, c);
            }
            if (numbers.get(j) == 47) {
                JLabel clubsQ = new JLabel(new ImageIcon(queenOfClubs.getCardImage()));
                c.gridx = 4;
                c.gridy = 6;
                panel.add(clubsQ, c);
            }
            if (numbers.get(j) == 48) {
                JLabel clubsK = new JLabel(new ImageIcon(kingOfClubs.getCardImage()));
                c.gridx = 5;
                c.gridy = 6;
                panel.add(clubsK, c);
            }

            System.out.print(numbers.get(j) + " ");
           // JLabel label5 = new JLabel("Test5");
            //c.gridx = 0;
            //c.gridy = 0;
            //c.insets = new Insets(10, 10, 10, 10);
           // panel.add(label5, c);
 
   
        }
        frame.setSize(700, 900);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        

    }

}

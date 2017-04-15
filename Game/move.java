package Game;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class move extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println(x + " , " + y);
        
       if ((x == ace1.getX()) && (y == ace1.getY()))
         {
       
           JLabel1.setText("You Clicked me");
         }

    }

}

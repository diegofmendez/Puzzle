package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Puzzle extends JFrame{

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Rompecabezas");
        frame.setTitle("Zoo App");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        frame.setLayout(new GridLayout(3,3));
        
        ArrayList<Piece> buttons = new ArrayList();
        for(int i = 1; i < 9; i++) {
            Piece piece = new Piece(i);
            buttons.add(piece);
        }
        for(Piece piece: buttons){
            frame.add(piece);
        }
        
        
        frame.setVisible(true);
    }
   
}

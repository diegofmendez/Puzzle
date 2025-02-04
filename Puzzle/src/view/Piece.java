package view;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;



public class Piece extends JPanel{
    private int id;
    private JButton button;    
    
    public Piece(int id){
        this.id = id;
        this.setLayout(new BorderLayout());
        System.out.println(id);
        button = new JButton();
        try {
            Image img = ImageIO.read(getClass().getResource(id+".png"));
            img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            button.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        this.add(button);
    }

    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        button.setText(Integer.toString(id));
    }
    
    
}

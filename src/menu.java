import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class menu extends JFrame implements ActionListener{
        private JButton przycisk;
    public menu(){
        this.setTitle("Moja Gra");
        this.setSize(1024, 768);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); 
        this.setLayout(null);
        this.setResizable(false); 

        przycisk= new JButton("Łatwy");
        przycisk.setBounds(100,100,100,40);
        przycisk.addActionListener(this);
        this.add(przycisk);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==przycisk) {
            this.dispose();
            new Gra();
        }

    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(menu::new);
    }
}

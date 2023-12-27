import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class menu extends JFrame implements ActionListener{
        private JButton przycisk;

    public menu(){
        this.setTitle("Moja Gra");
        this.setSize(1024, 768);
        this.getContentPane().setBackground(new Color(102, 255, 102));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); 
        this.setLayout(null);
        this.setResizable(false); 

        przycisk= new JButton("Łatwy");
        przycisk.setBounds(350,100,300,70);
        przycisk.setForeground(Color.BLACK);
        przycisk.setBackground(Color.WHITE);
        przycisk.setFont(new Font("Arial",Font.PLAIN,34));
        przycisk.setBorder(BorderFactory.createEtchedBorder());
        przycisk.addActionListener(this);
        this.add(przycisk);
        this.setVisible(true);
        this.add()

        JPanel topicOfMenu= new JPanel();
        topicOfMenu.setBounds(300,0,460,75);
        topicOfMenu.setFont;




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

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class menu extends JFrame implements ActionListener{
        private JButton przycisk;
        private JButton przycisk2;
        private JButton przycisk3;
        JLabel topicOfMenu1=new JLabel();

    public menu(){
        ImageIcon backgroundMenu= new ImageIcon("tlo2.png");

        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundMenu.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        this.setTitle("Moja Gra");
        this.setSize(1024, 768);
        this.setContentPane(backgroundPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); 
        this.setLayout(null);
        this.setResizable(false); 

        przycisk= new JButton("Łatwy");
        przycisk.setBounds(350,150,300,70);
        przycisk.setForeground(Color.BLACK);
        przycisk.setBackground(Color.WHITE);
        przycisk.setFont(new Font("Arial",Font.PLAIN,34));
        przycisk.setBorder(BorderFactory.createEtchedBorder());
        przycisk.addActionListener(this);

        przycisk2= new JButton("Średni");
        przycisk2.setBounds(350,320,300,70);
        przycisk2.setForeground(Color.BLACK);
        przycisk2.setBackground(Color.WHITE);
        przycisk2.setFont(new Font("Arial",Font.PLAIN,34));
        przycisk2.setBorder(BorderFactory.createEtchedBorder());
        przycisk2.addActionListener(this);

        przycisk3= new JButton("Trudny");
        przycisk3.setBounds(350,490,300,70);
        przycisk3.setForeground(Color.BLACK);
        przycisk3.setBackground(Color.WHITE);
        przycisk3.setFont(new Font("Arial",Font.PLAIN,34));
        przycisk3.setBorder(BorderFactory.createEtchedBorder());
        przycisk3.addActionListener(this);

        JPanel topicOfMenu= new JPanel();
        topicOfMenu.setBounds(280,0,460,75);
        topicOfMenu.setBackground(new Color(107, 240, 0));

        topicOfMenu1.setText("NumberCrusade");
        topicOfMenu1.setFont(new Font("Arial",Font.PLAIN,52));
        this.setVisible(true);
        this.add(przycisk);
        this.add(przycisk2);
        this.add(przycisk3);
        this.add(topicOfMenu);
        topicOfMenu.add(topicOfMenu1);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==przycisk) {
            this.dispose();
            new Gra();
        } else if(e.getSource()==przycisk2) {
            this.dispose();
            new GraSredni();
        }
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(menu::new);
    }
}

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuOfGame extends JFrame implements ActionListener{
    private JButton goToMenu;
    private JButton endOfGame;

    JLabel scoreOfTime= new JLabel();

    private String getScoreFromGra;
    public menuOfGame(){
        this.setTitle("Menu");
        this.setSize(512, 512);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);

        scoreOfTime.setText("Menu");
        scoreOfTime.setFont(new Font("Arial",Font.PLAIN,52));

        JPanel scoreOfTime2= new JPanel();
        scoreOfTime2.setBounds(0,50,500,75);

        this.add(scoreOfTime2);
        scoreOfTime2.add(scoreOfTime);

        goToMenu= new JButton("Wybierz poziom");
        goToMenu.setBounds(100,120,300,70);
        goToMenu.setForeground(Color.BLACK);
        goToMenu.setBackground(Color.WHITE);
        goToMenu.setFont(new Font("Arial",Font.PLAIN,34));
        goToMenu.setBorder(BorderFactory.createEtchedBorder());
        goToMenu.addActionListener(this);
        this.add(goToMenu);

        endOfGame= new JButton("Zakoncz gre");
        endOfGame.setBounds(100,250,300,70);
        endOfGame.setForeground(Color.BLACK);
        endOfGame.setBackground(Color.WHITE);
        endOfGame.setFont(new Font("Arial",Font.PLAIN,34));
        endOfGame.setBorder(BorderFactory.createEtchedBorder());
        endOfGame.addActionListener(this);
        this.add(endOfGame);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == goToMenu) {
            this.dispose();
            new menu();
        } else if (e.getSource() == endOfGame) {
            this.dispose();
            System.exit(0);
        }
    }
}



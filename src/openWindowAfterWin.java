import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class openWindowAfterWin extends JFrame implements ActionListener{
        private JButton goToMenu;
        private JButton buttonofleave;

        JLabel scoreOfTime= new JLabel();

        private String getScoreFromGra;
    public openWindowAfterWin(){
        this.setTitle("Gratulacje");
        this.setSize(512, 512);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);

        scoreOfTime.setText("Gratulacje ");//+(getScoreFromGra != null ? getScoreFromGra : ""));
        scoreOfTime.setFont(new Font("Arial",Font.PLAIN,32));

        JPanel scoreOfTime2= new JPanel();
        scoreOfTime2.setBounds(0,50,500,75);

        this.add(scoreOfTime2);
        scoreOfTime2.add(scoreOfTime);

        goToMenu= new JButton("Powrót do menu");
        goToMenu.setBounds(100,120,300,70);
        goToMenu.setForeground(Color.BLACK);
        goToMenu.setBackground(Color.WHITE);
        goToMenu.setFont(new Font("Arial",Font.PLAIN,34));
        goToMenu.setBorder(BorderFactory.createEtchedBorder());
        goToMenu.addActionListener(this);
        this.add(goToMenu);

        buttonofleave= new JButton("Wyjscie");
        buttonofleave.setBounds(100,250,300,70);
        buttonofleave.setForeground(Color.BLACK);
        buttonofleave.setBackground(Color.WHITE);
        buttonofleave.setFont(new Font("Arial",Font.PLAIN,34));
        buttonofleave.setBorder(BorderFactory.createEtchedBorder());
        buttonofleave.addActionListener(this);
        this.add(buttonofleave);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == goToMenu) {
            this.dispose();
            new Gra();
        } else if (e.getSource()==buttonofleave) {
            this.dispose();
            System.exit(0);
        }
    }

    public void methodOfGetScoreFromGra(String getScoreFromGra) {
      this.getScoreFromGra=getScoreFromGra;
    }
}

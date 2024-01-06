import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class openWindowAfterWin extends JFrame implements ActionListener{
        private JButton tryAgain;
        private JButton getMenu;

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

        tryAgain= new JButton("Powtórz poziom");
        tryAgain.setBounds(100,120,300,70);
        tryAgain.setForeground(Color.BLACK);
        tryAgain.setBackground(Color.WHITE);
        tryAgain.setFont(new Font("Arial",Font.PLAIN,34));
        tryAgain.setBorder(BorderFactory.createEtchedBorder());
        tryAgain.addActionListener(this);
        this.add(tryAgain);

        getMenu= new JButton("Powrót do menu");
        getMenu.setBounds(100,250,300,70);
        getMenu.setForeground(Color.BLACK);
        getMenu.setBackground(Color.WHITE);
        getMenu.setFont(new Font("Arial",Font.PLAIN,34));
        getMenu.setBorder(BorderFactory.createEtchedBorder());
        getMenu.addActionListener(this);
        this.add(getMenu);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tryAgain) {
            this.dispose();
            new Gra();
        } else if (e.getSource()==getMenu) {
            this.dispose();
            new menu();
        }
    }

    public void methodOfGetScoreFromGra(String getScoreFromGra) {
      this.getScoreFromGra=getScoreFromGra;
    }
}

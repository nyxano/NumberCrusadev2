import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class openWindowAfterLoss extends JFrame implements ActionListener{
    private JButton tryAgain;
    private JButton getMenu;

    JLabel scoreOfTime= new JLabel();

    private String getScoreFromGra;
    public openWindowAfterLoss(){
        this.setTitle("Gratulacje");
        this.setSize(512, 512);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);

        scoreOfTime.setText("Niestety nie zdobyłeś dokladnej liczby punktów");
        scoreOfTime.setFont(new Font("Arial",Font.PLAIN,42));

        JPanel scoreOfTime2= new JPanel();
        scoreOfTime2.setBackground(new Color(255, 230, 204));
        scoreOfTime2.setBounds(0,0,460,75);
        Border border2=BorderFactory.createLineBorder(Color.BLACK,3);
        scoreOfTime2.setBorder(border2);

        this.add(scoreOfTime2);
        scoreOfTime2.add(scoreOfTime);

        tryAgain= new JButton("Spróbuj ponownie");
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

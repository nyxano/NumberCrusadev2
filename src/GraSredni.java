import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;


class GraSredni extends JFrame implements MouseListener, timerCounter.TimeUpdateListener, ActionListener {

    int counter=0;
    JLabel topic_1= new JLabel();
    JLabel topic_2= new JLabel();
    JLabel topic_3= new JLabel();
    JButton menu=new JButton();
    int scoreMain=randomNum2();
    private timerCounter timerCounterInstance;
    private String timeOfGame;
    public GraSredni() {

        timerCounterInstance = new timerCounter(this);
        //Config of Jlabel include Images and values
        ImageIcon image = new ImageIcon("elementbt.png");
        Border border = BorderFactory.createLineBorder(new Color(102, 255, 224));
        JLabel label = new JLabel();
        label.setText(String.valueOf(randomNum()));
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("MRK Maston Pro", Font.PLAIN, 72));
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(120, 140, 150, 150);

        JLabel label2 = new JLabel();
        label2.setText(String.valueOf(randomNum())); //HERE WILL BE A SCORE FOR EACH OTHER CIRCLE
        label2.setIcon(image);
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("MRK Maston Pro", Font.PLAIN, 72));
        label2.setBorder(border);
        label2.setVerticalAlignment(JLabel.CENTER);
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setBounds(140, 400, 150, 150);

        JLabel label3 = new JLabel();
        label3.setText(String.valueOf(randomNum())); //HERE WILL BE A SCORE FOR EACH OTHER CIRCLE
        label3.setIcon(image);
        label3.setHorizontalTextPosition(JLabel.CENTER);
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("MRK Maston Pro", Font.PLAIN, 72));
        label3.setBorder(border);
        label3.setVerticalAlignment(JLabel.CENTER);
        label3.setHorizontalAlignment(JLabel.CENTER);
        label3.setBounds(400, 100, 150, 150);

        JLabel label4 = new JLabel();
        label4.setText(String.valueOf(randomNum())); //HERE WILL BE A SCORE FOR EACH OTHER CIRCLE
        label4.setIcon(image);
        label4.setHorizontalTextPosition(JLabel.CENTER);
        label4.setForeground(Color.BLACK);
        label4.setFont(new Font("MRK Maston Pro", Font.PLAIN, 72));
        label4.setBorder(border);
        label4.setVerticalAlignment(JLabel.CENTER);
        label4.setHorizontalAlignment(JLabel.CENTER);
        label4.setBounds(400, 500, 150, 150);

        JLabel label5 = new JLabel();
        label5.setText(String.valueOf(randomNum())); //HERE WILL BE A SCORE FOR EACH OTHER CIRCLE
        label5.setIcon(image);
        label5.setHorizontalTextPosition(JLabel.CENTER);
        label5.setForeground(Color.BLACK);
        label5.setFont(new Font("MRK Maston Pro", Font.PLAIN, 72));
        label5.setBorder(border);
        label5.setVerticalAlignment(JLabel.CENTER);
        label5.setHorizontalAlignment(JLabel.CENTER);
        label5.setBounds(700, 140, 150, 150);

        JLabel label6 = new JLabel();
        label6.setText(String.valueOf(randomNum())); //HERE WILL BE A SCORE FOR EACH OTHER CIRCLE
        label6.setIcon(image);
        label6.setHorizontalTextPosition(JLabel.CENTER);
        label6.setForeground(Color.BLACK);
        label6.setFont(new Font("MRK Maston Pro", Font.PLAIN, 72));
        label6.setBorder(border);
        label6.setVerticalAlignment(JLabel.CENTER);
        label6.setHorizontalAlignment(JLabel.CENTER);
        label6.setBounds(700, 400, 150, 150);


        topic_1.setText("Dodawanie");
        topic_1.setFont(new Font("Arial", Font.PLAIN, 42));

        topic_2.setText("score: " + counter + "/" + scoreMain);
        topic_2.setFont(new Font("Arial", Font.PLAIN, 42));

        topic_3.setText("00:00");
        topic_3.setFont(new Font("Arial", Font.PLAIN, 52));


        //Config of JPanel

        JPanel topic = new JPanel();
        topic.setBackground(new Color(255, 230, 204));
        topic.setBounds(0, 0, 400, 75);
        Border border2 = BorderFactory.createLineBorder(Color.BLACK, 3);
        topic.setBorder(border2);

        JPanel topic2 = new JPanel();
        topic2.setBackground(new Color(255, 230, 204));
        topic2.setBounds(400, 0, 270, 75);
        Border border3 = BorderFactory.createLineBorder(Color.BLACK, 3);
        topic2.setBorder(border3);

        JPanel topic3 = new JPanel();
        topic3.setBackground(new Color(255, 230, 204));
        topic3.setBounds(670, 0, 250, 75);
        Border border4 = BorderFactory.createLineBorder(Color.BLACK, 3);
        topic3.setBorder(border4);

        ImageIcon menuOfPicture=new ImageIcon("multiplyBT.png");
        menu.setIcon(menuOfPicture);
        menu.setBackground(new Color(255, 22, 22, 255));
        menu.setBounds(920, 0, 100, 75);
        Border border5 = BorderFactory.createLineBorder(Color.BLACK, 3);
        menu.setBorder(border5);
        menu.addActionListener(this);

        //Config of JFrame
        this.setTitle("Moja Gra");
        this.setSize(1024, 768);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(102, 255, 224));
        this.add(label);
        this.add(label2);
        this.add(label3);
        this.add(label4);
        this.add(label5);
        this.add(label6);
        this.add(topic);
        this.add(topic2);
        this.add(topic3);
        this.add(menu);
        label.addMouseListener(this);
        label2.addMouseListener(this);
        label3.addMouseListener(this);
        label4.addMouseListener(this);
        label5.addMouseListener(this);
        label6.addMouseListener(this);
        topic.add(topic_1);
        topic2.add(topic_2);
        topic3.add(topic_3);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        JLabel clickedLabel=(JLabel) e.getSource();
        int score=getCurrentScore(clickedLabel);
        clickedLabel.setText(String.valueOf(randomNum()));
        counter += score;
        topic_2.setText("Wynik: " + counter + "/" + scoreMain);

        if(counter==scoreMain){
            this.dispose();
            new openWindowAfterWin();
        } else if (counter>scoreMain) {
            this.dispose();
            new openWindowAfterLoss();
        }
    }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    public void onTimeUpdate(String formattedTime) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                topic_3.setText(formattedTime);

            }
        });
        if(counter==scoreMain){
            timeOfGame = formattedTime;
        }
    }

    public String getTimeOfGame(){
        return timeOfGame;
    }

    public void timeOfGameToOpenWindowAfterWin(openWindowAfterWin x){
        x.methodOfGetScoreFromGra(this.getTimeOfGame());

    }


    public int randomNum(){
        Random randomNumbers= new Random();
        int x= randomNumbers.nextInt(5)+1;
        return x;
    }
    public int randomNum2(){
        //Generate random numbers of label and score
        Random randomNumbers= new Random();
        int x= randomNumbers.nextInt(15)+10;
        return x;
    }
    private int getCurrentScore(JLabel label){
        try {
            return Integer.parseInt(label.getText());
        } catch (NumberFormatException e){
            e.printStackTrace();
            return 0;
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==menu) {
            this.dispose();
            new menuOfGame();
        }
    }
}
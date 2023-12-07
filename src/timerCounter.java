import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class timerCounter {
    private int seconds = 0;
    private int minutes = 0;
    private Timer timer;
    private TimeUpdateListener timeUpdateListener;
    public timerCounter(TimeUpdateListener timeUpdateListener) {
        this.timeUpdateListener = timeUpdateListener;

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timerUpdate();
            }
        });
        timer.start();
    }
    void timerUpdate() {
        seconds++;

        if (seconds == 60) {
            seconds = 0;
            minutes++;
        }
        if (timeUpdateListener != null) {
            timeUpdateListener.onTimeUpdate(String.format("%02d:%02d", minutes, seconds));
        }
    }
    public interface TimeUpdateListener {
        void onTimeUpdate(String formattedTime);
    }
}

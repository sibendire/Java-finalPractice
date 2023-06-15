package methodsjava.packages;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {

    public MyWindow(String title) {
        super(title);
        setSize(120,730);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sarsSerifLarge = new Font("sarsSerif",Font.BOLD,18);
        Font sarsSerifSmall = new Font("sarsSerifSmall",Font.ITALIC,12);
        g.setFont(sarsSerifLarge);
        g.drawString("complete master class course",60,60);
        g.setFont(sarsSerifSmall);
        g.drawString("Your open to work",60,100 );
    }
}

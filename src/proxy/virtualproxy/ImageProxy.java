package proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon{
    volatile ImageIcon imageIcon;
    final URL imageUrl;
    Thread retrieveThread;
    boolean retrieving = false;


    public ImageProxy(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if(imageIcon != null){
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading CD cover, please wait...", x+300, y+190);
            if(!retrieving){
                retrieving = true;

                retrieveThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            setImageIcon(new ImageIcon(imageUrl, "CD Cover"));
                            c.repaint();
                        } catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                });

                retrieveThread.start();
            }
        }
    }

    private void setImageIcon(ImageIcon cd_cover) {
        this.imageIcon = cd_cover;
    }

    @Override
    public int getIconWidth() {
        if(imageIcon != null){
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }

    }

    @Override
    public int getIconHeight() {
        if(imageIcon != null){
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }
}

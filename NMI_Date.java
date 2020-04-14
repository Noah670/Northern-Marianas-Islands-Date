/* 
*
*Chamorro Standard Time (ChST) is 10 hours ahead of Coordinated Universal Time (UTC). This time zone is in use during standard time in: Pacific.
*
* CNMI & Guam
*
*@author Noah
*@version v1.0
*/

// imports for date and time
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

// import for java swing application
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.Graphics;

/* 
*
*Chamorro Standard Time (ChST) is 10 hours ahead of Coordinated Universal Time (UTC). This time zone is in use during standard time in: Pacific.
*
*
*/

public class NMI_Date {

    private int Chamorro;

    static JFrame runFrame;

    public static void main(String[] args) {
        System.out.println("Getting current time for the Northern Mariana Islands and Guam");

        Date currentDate = new Date();
        // format current date with year/month/day and hour/minute
        DateFormat df = new SimpleDateFormat("MMMM dd yyyy HH:mm a");

        // Set TimeZone
        df.setTimeZone(TimeZone.getTimeZone("Pacific/Guam"));

        String displayClock = df.format(currentDate);

        System.out.println("Current date and time in Northern Mariana Islands and Guam: " + displayClock);

        ImageIcon wallpaper = new ImageIcon("images/birdIsland.jpg");

        // created buffered image to resize image
        BufferedImage bi = new BufferedImage(wallpaper.getIconWidth(), wallpaper.getIconHeight(),
                BufferedImage.TYPE_INT_ARGB);

        Graphics g = bi.createGraphics();
        // redraw image
        g.drawImage(bi, 0, 0, runFrame);

        // use image icon created
        ImageIcon newIcon = new ImageIcon(bi);

        // JOptionPane.showMessageDialog(null, wallpaper, displayClock, 0);

        runFrame = new JFrame();
        runFrame.setSize(300, 300);
        runFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel(displayClock);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JOptionPane.showMessageDialog(runFrame, wallpaper, displayClock, 0);

        JOptionPane.showMessageDialog(runFrame, displayClock, "Current Date and Time:", 0);

    }

    public int getChamorro() {
        return Chamorro;
    }

    public void setChamorro(int Chamorro) {
        this.Chamorro = Chamorro;
    }
}

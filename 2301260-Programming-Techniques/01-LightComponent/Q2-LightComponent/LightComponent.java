import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class LightComponent extends JComponent {
    public void paintComponent(Graphics ink) {
        Graphics2D bendy = (Graphics2D) ink;
        Rectangle box = new Rectangle(50, 50, 100, 200);
        bendy.draw(box);
        Ellipse2D.Double rLight = new Ellipse2D.Double(75, 60, 50, 50);
        Ellipse2D.Double yLight = new Ellipse2D.Double(75, 125, 50, 50);
        Ellipse2D.Double gLight = new Ellipse2D.Double(75, 190, 50, 50);
        bendy.setColor(Color.RED);
        bendy.fill(rLight);
        bendy.setColor(Color.YELLOW);
        bendy.fill(yLight);
        bendy.setColor(Color.GREEN);
        bendy.fill(gLight);
    }
}

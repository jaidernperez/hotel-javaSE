package co.edu.usta.hotel.utilities;

import java.awt.Component;
import java.awt.Container;
import java.beans.PropertyVetoException;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class OpenWindow {

    private static void configWindow(Class myFrame, JDesktopPane desktop) throws PropertyVetoException, InstantiationException, IllegalAccessException {
        JInternalFrame window = (JInternalFrame) myFrame.newInstance();
        desktop.add(window);
        window.setVisible(true);
        window.setMaximum(true);
        BasicInternalFrameUI ui = (BasicInternalFrameUI) window.getUI();
        Container northPane = (Container) ui.getNorthPane();
        northPane.remove(0);
        northPane.validate();
        northPane.repaint();
        ui.setNorthPane(null);
    }

    public static void openWindow(Class myFrame, JDesktopPane desktop) throws PropertyVetoException, InstantiationException, IllegalAccessException {
        int quantity;

        Component[] array = desktop.getAllFrames();
        quantity = array.length;
        if (quantity > 0) {
            desktop.removeAll();
        }
        configWindow(myFrame, desktop);
    }
}

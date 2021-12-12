/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.uiutils;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author dwith
 */
public class UiUtils {
    public static void nextScreen(JPanel container, JPanel nextPanel, 
            String nextPanelName) {
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("workArea", new JScrollPane(nextPanel));
        layout.next(container);
    }
    
    public static void previousScreen(JPanel container, JPanel currentScreen) {
        container.remove(currentScreen);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }
}

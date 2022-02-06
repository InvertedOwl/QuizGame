package com.invertedowl;

import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Canvas extends Component implements MouseListener {
    private int question = 0;
    private static final Color back = new Color(173, 216, 230);
    private ArrayList<Button> titleButtons = new ArrayList<Button>();

    public Canvas() {
        initializeTitleButtons();


    }

    public void paint(Graphics graphics){
        graphics.setColor(back);
        graphics.fillRect(0, 0, 600, 600);

        if (question == 0){
            drawTitle(graphics);
        } else {
            graphics.setColor(new Color(255, 80, 80));
            graphics.fillRoundRect(5 + 5, 8 + 5, 35, 55, 10, 10);


            graphics.setColor(new Color(255, 127, 127));
            graphics.fillRoundRect(5, 8, 35, 55, 10, 10);
            graphics.setFont(new Font("Comfortaa", Font.BOLD, 50));
            graphics.setColor(Color.white);
            graphics.drawString(Integer.toString(question), 10, 50);
        }


        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        repaint();
    }

    public void initializeTitleButtons () {
        titleButtons.add(new Button(300 -100, 300 -25, 200, 50, "Start Quiz!", new ButtonAction() {
            @Override
            public void onClick() {
                question = 1;
            }

            @Override
            public void onHover() {

            }

            @Override
            public void onUnHover() {

            }
        }));
    }

    public void drawTitle (Graphics graphics){
        for (Button button : titleButtons){
            graphics.setColor(new Color(255, 80, 80));

            graphics.fillRoundRect(button.x + 5, button.y + 5, button.sizex, button.sizey, 20, 20);
            graphics.setColor(new Color(255, 127, 127));
            graphics.fillRoundRect(button.x, button.y, button.sizex, button.sizey, 20, 20);

            graphics.setColor(new Color(255, 255, 255));
            graphics.setFont(new Font("Comfortaa", Font.BOLD, 20));
            int width = graphics.getFontMetrics().stringWidth(button.string);
            graphics.drawString(button.string, button.x + (width/2) + 5, button.y + graphics.getFont().getSize() + (button.sizey / 4));
        }
    }

    /**
     * Invoked when the mouse button has been clicked (pressed
     * and released) on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    /**
     * Invoked when a mouse button has been pressed on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mousePressed(MouseEvent e) {
        for (Button button : titleButtons){
            if (e.getX() > button.x && e.getX() < button.x + button.sizex && e.getY() - 30 > button.y && e.getY() - 30 < button.y + button.sizey){
                button.buttonAction.onClick();
            }
        }
    }

    /**
     * Invoked when a mouse button has been released on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseReleased(MouseEvent e) {

    }

    /**
     * Invoked when the mouse enters a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    /**
     * Invoked when the mouse exits a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseExited(MouseEvent e) {

    }
}

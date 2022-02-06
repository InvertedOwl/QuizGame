package com.invertedowl;

public class Button {
    public int x, y, sizex, sizey;
    public ButtonAction buttonAction;
    public String string;

    public Button (int x, int y, int sizex, int sizey, String string, ButtonAction buttonAction) {
        this.x = x;
        this.sizex = sizex;
        this.y = y;
        this.sizey = sizey;
        this.buttonAction = buttonAction;
        this.string = string;
    }
    public void onClick() {
        buttonAction.onClick();
    }
}

package com.timbuchalka;

/**
 * Created by keanehubertang on 8/3/15.
 */
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp() {
        theCase.pressPowerButton();
        motherboard.loadProgram("Windows 1.0");
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
        monitor.drawPixelAt(1200, 50, "Yellow");
    }


}

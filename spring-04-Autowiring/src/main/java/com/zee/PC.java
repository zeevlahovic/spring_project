package com.zee;

import com.zee.casefactory.Case;
import com.zee.monitorfactory.Monitor;
import com.zee.motherboardfactory.Motherboard;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
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
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
        monitor.drawPixelAt();
    }

}


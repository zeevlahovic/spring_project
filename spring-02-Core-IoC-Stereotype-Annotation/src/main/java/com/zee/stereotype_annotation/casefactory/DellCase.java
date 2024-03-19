package com.zee.stereotype_annotation.casefactory;

import com.zee.stereotype_annotation.casefactory.Case;
import org.springframework.stereotype.Component;

@Component
public class DellCase extends Case {

    public DellCase() {
        super("2208","Dell","240");
    }



    public void pressPowerButton() {

        System.out.println("Power button pressed");
    }
}

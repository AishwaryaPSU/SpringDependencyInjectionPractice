package io.itsagm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {

    private int id;
    private MathCheat mathCheat;

    public void setId(int id) {
        this.id = id;
    }

    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    public void cheating(){
        mathCheat.mathCheat();
    }
}

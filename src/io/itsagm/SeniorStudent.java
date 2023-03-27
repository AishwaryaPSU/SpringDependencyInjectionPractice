package io.itsagm;

public class SeniorStudent {
    private int id;
    private MathCheat cheat;

    public void setId(int id) {
        this.id = id;
    }

    public void setCheat(MathCheat cheat) {
        this.cheat = cheat;
    }

    public void cheating(){
        System.out.println("Senior Math cheating");
        cheat.mathCheat();
    }
}

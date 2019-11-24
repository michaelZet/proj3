package nowy;

import obiektowosc.nju;

public class woman extends nju {
    private String plec;

    public woman (String name, String surname, Integer birthyear) {
        super(name, surname, birthyear);
        this.plec = "kobieta";

    }
    //override
    public void przedstawsie(){
        super.przedstawsie();
        System.out.println("Jestem " + this.plec);
    }
}

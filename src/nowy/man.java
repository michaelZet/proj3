package nowy;

import obiektowosc.nju;

public class man extends nju{
    private String plec;
    private Integer waga;
    private Integer sila;

    public man (String name, String surname, Integer birthyear) {
        super(name, surname, birthyear);
        this.plec = "mezczyzna";
    }
    public void setPlec (Integer waga){
        this.waga = waga;

    }
    public void ocensile () {
        if (this.waga < 45) {
            this.sila = 1;
        }else
                if (this.waga <= 90)
                this.sila = 2;
            else
                this.sila = 3;
        }

    public void przedstawsie() {
        super.przedstawsie();
        switch (this.sila) {
            case 1:
                System.out.println("SIla nie jest moja mocna strona");
                break;
            case 2:
                System.out.println("Jestem wystarczajaco silny");
                break;
            case 3:
                System.out.println("Jestem mega silny");
        }
    }


    public void setWaga(Integer waga) {
        this.waga = waga;
    }

    public int getWaga() {
        return waga;
    }
}

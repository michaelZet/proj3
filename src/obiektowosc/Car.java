package obiektowosc;

public class Car {
    private String model;
    private String producent;
    private Integer rokprod;
    private Integer predkosc;
    private Integer wiek;


    public Car(String model, String producent, Integer rokprod) {
        this.model = model;
        this.producent = producent;
        this.rokprod = rokprod;
        this.wiek = this.obliczwiek();
        this.predkosc = 0;


    }



    Integer obliczwiek() {
        Integer actualyear = 2019;
        return actualyear - this.rokprod;
    }

    public Integer przyspiesz(Integer zmiana) {
        this.predkosc += zmiana;
        System.out.println("Twoja aktualzna predkosc to:" + this.predkosc);
        return this.predkosc;
    }

    public void opiszauto() {
        System.out.println("Oto" + this.producent + " " + this.model);
        if (this.wiek < 5) {
            System.out.println("Nowe auto prawie nie uzywane");
        } else if (this.wiek <= 20) {
            System.out.println("Troche juz jezdzi ale jeszcze dziala");
        } else {
            System.out.println("Nadaje sie tylko na zlom");
        }

    }
}


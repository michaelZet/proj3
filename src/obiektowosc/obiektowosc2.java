package obiektowosc;

import obiektowosc.Car;

public class obiektowosc2 {
    public static void main(String[] args) {
        //2 obiekty klasy Car
        Car opel = new Car("opel", "astra", 2006);
        opel.przyspiesz( 60);
        opel.opiszauto();

        Car bmw = new Car("Bmw","M3", 2016);
        bmw.przyspiesz( 152);
        bmw.opiszauto();
    }
}

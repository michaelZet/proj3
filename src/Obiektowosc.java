public class Obiektowosc {
    public static void main(String[] args){
        nju czlowiek1 = new nju(  "Michał",  "Z",  1995);
        //Metoda przedstawsie jest dotepna bo jest public
        czlowiek1.przedstawsie();
        // arybut name oraz funkcja oblicz wiek nie są dostępone poza klasą human
        // bo są private;
        //czlowiek1.name;
        //czlowiek1.obliczwiek();

        nju czlowiek2 = new nju( "Robert",  "Kowalski", 1995);
        czlowiek2.przedstawsie();

        nju czlowiek3 = new nju ("Bart", "Sroka", 1959);
        czlowiek3.przedstawsie();
        System.out.println(czlowiek3.getName() + "" + czlowiek3.getSurname());
        czlowiek3.setBirthyear(1975);
        czlowiek3.przedstawsie();
    }
}

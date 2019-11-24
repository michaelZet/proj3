package obiektowosc;

public class nju {
    //atrybuty klasy
    private String name;
    private String surname;
    private Integer birthyear;
    private Integer age;
    //konstruktor
    public nju(String name, String surname, Integer birthyear){
        this.name = name;
        this.surname = surname;
        this.birthyear = birthyear;
        this.age = this.obliczwiek();

    }

//slowo static pozwala dostac sie do tej funkcji bez inicjalizacji obiektu
    //nie mozemy operwac w niej na zadnych atrybutach/metodach niestatycznych
    public static void opiszklase(){
        System.out.println("Klasa oblicza wiek i umozliwia przedstawienie sie obiektu");
    }



    //metody klasy
    Integer obliczwiek(){
        Integer actualyear = 2019;
        return  actualyear - this.birthyear;
    }

    public void przedstawsie(){
        System.out.println("Hej nazywam sie " + this.name + " " + this.surname);
        System.out.println("Mam " + this.age + " lat");
    }

    //metody settery z gettery
    //getter
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    //Setter
    public void setBirthyear (Integer birthyear){
        this.birthyear = birthyear;
        this.age = this.obliczwiek();
    }

}

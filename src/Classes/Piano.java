package Classes;

public class Piano {
    public static void main(String[] args) {
        Ghita ghita = new Ghita(12, "Piano");
        Ghita ghita1 = new Ghita(16, "Guitar");

        System.out.println(ghita.name +":"+ghita.age);
        System.out.println(ghita1.name +":" + ghita1.age);
    }
}

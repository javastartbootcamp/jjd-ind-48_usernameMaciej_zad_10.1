package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        TelephoneStore telephoneStore = new TelephoneStore();
        telephoneStore.addTelephones();

        System.out.println("Telefony zapisane w tablicy:");
        System.out.println(telephoneStore);
    }
}

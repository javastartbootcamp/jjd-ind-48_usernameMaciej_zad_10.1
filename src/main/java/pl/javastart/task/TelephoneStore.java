package pl.javastart.task;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class TelephoneStore extends Telephone {
    Scanner sc = new Scanner(System.in);

    private static final int MAX_TELEPHONES = 2;
    private int telephoneIndex;
    private Telephone[] telephones = new Telephone[MAX_TELEPHONES];

    void addTelephones() {
        System.out.println("Podaj informację o trzech telefonach");
        System.out.println("Podaj nazwę:");
        String name1 = sc.nextLine();
        System.out.println("Podaj ilość pamięci:");
        int memory1 = sc.nextInt();
        sc.nextLine();
        telephoneIndex++;
        while (telephoneIndex < MAX_TELEPHONES) {
            System.out.println("Podaj nazwę:");
            String name2 = sc.nextLine();
            System.out.println("Podaj ilość pamięci:");
            int memory2 = sc.nextInt();
            sc.nextLine();
            if (name1.equals(name2)) {
                if (memory1 == memory2) {
                    System.out.println("Duplikat");
                    telephoneIndex--;
                }
            }
            telephoneIndex++;
        }
    }

    static void printTelephones(Telephone[] telephones) {
        System.out.println("Telefony:");
        for (Telephone telephone : telephones) {
            System.out.println(telephone);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TelephoneStore that = (TelephoneStore) o;
        return telephoneIndex == that.telephoneIndex && Objects.equals(sc, that.sc) && Arrays.equals(telephones, that.telephones);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), sc, telephoneIndex);
        result = 31 * result + Arrays.hashCode(telephones);
        return result;
    }

    @Override
    public String toString() {
        return "Telefon: " + getName() +
                ", pamięć: " + getMemory() + "GB";
    }
}

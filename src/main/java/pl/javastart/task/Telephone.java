package pl.javastart.task;

import java.util.Objects;
import java.util.Scanner;

public abstract class Telephone {
    private String name;
    private int memory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telephone telephone = (Telephone) o;
        return memory == telephone.memory && Objects.equals(name, telephone.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, memory);
    }

    @Override
    public String toString() {
        return "Telefon: " + name +
                ", pamięć: " + memory + "GB";
    }
}

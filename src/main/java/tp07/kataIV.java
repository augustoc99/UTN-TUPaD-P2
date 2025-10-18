import java.util.List;

class Animal {
    public void hacerSonido() { System.out.println("(silencio genérico)"); }
    public String describirAnimal() { return "Soy un animal"; }
}

class Perro extends Animal {
    @Override public void hacerSonido() { System.out.println("Guau!"); }
    @Override public String describirAnimal() { return "Soy un perro"; }
}

class Gato extends Animal {
    @Override public void hacerSonido() { System.out.println("Miau!"); }
    @Override public String describirAnimal() { return "Soy un gato"; }
}

class Vaca extends Animal {
    @Override public void hacerSonido() { System.out.println("Muuu!"); }
    @Override public String describirAnimal() { return "Soy una vaca"; }
}

public class Kata4Animales {
    public static void main(String[] args) {
        List<Animal> granja = List.of(new Perro(), new Gato(), new Vaca(), new Animal());
        for (Animal a : granja) {
            System.out.print(a.describirAnimal() + " → ");
            a.hacerSonido(); // polimorfismo por override
        }
    }
}

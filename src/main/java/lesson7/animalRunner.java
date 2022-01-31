package lesson7;

public class AnimalRunner {

    public static void main(String[] args) {
        Dog bobik = new Dog("Бобик", 300, 130);
        bobik.run(200);
        bobik.run(400);
        bobik.swim(100);
        bobik.swim(150);
        bobik.bark(3);

        Cat murzik = new Cat("Мурзик", 200, 0);
        murzik.run(200);
        murzik.run(400);
        murzik.swim(100);
        murzik.swim(150);
        murzik.mew(3);
        murzik.hiss();
        murzik.purr();

        BigCat tiger = new BigCat("Тайгер", 500, 200);
        tiger.roar();

        Animal[] animals = new Animal[] {bobik, murzik, tiger};
        for (Animal animal: animals) {
            System.out.printf("%s\n", animal.getName());
        }

    }
}

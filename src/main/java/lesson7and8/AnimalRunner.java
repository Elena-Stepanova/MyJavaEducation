package lesson7and8;

public class AnimalRunner {

    public static void main(String[] args) {
        Dog bobik = new Dog("Бобик", 300, 130, "Гав!");
        bobik.run(200);
        bobik.run(400);
        bobik.swim(100);
        bobik.swim(150);
        bobik.bark(3);
        System.out.println("-----------------");

        Cat murzik = new Cat("Мурзик", 200, 0, "Мяу");
        murzik.run(200);
        murzik.run(400);
        murzik.swim(100);
        murzik.swim(150);
        murzik.mew(3);
        murzik.hiss();
        murzik.purr();
        System.out.println("-----------------");

        BigCat tiger = new BigCat("Тигр", 500, 200, "Р-р-р!");
        tiger.roar();
        System.out.println("-----------------");

        Bird crane = new Bird("Птиц", 200, 0, "Курлы" );
        crane.run(300);
        crane.fly();
        crane.swim(100);
        crane.signal(10);
        System.out.println("-----------------");

        Animal[] animals = new Animal[] {bobik, murzik, tiger, crane};
        for (Animal animal: animals) {
            animal.voice();
        }
}
}

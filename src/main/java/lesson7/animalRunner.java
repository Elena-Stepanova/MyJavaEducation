package lesson7;

import java.lang.reflect.Array;

public class animalRunner {

    public static void main(String[] args) {

        Dog dogTerry = new Dog("Терри", "терьер", 800, 30, 35.0);
        System.out.println(dogTerry.getName());

        Dog dogLord = new Dog ("Лорд", "дог", 5000, 500, 90.0);

        Cat catKitty = new Cat("Китти", 1000, -1);

        Tiger tigerSunny = new Tiger("Санни", 30000, 2000);

        Gopher suslikGuf = new Gopher("Гуф", 50, -1);

        Chicken kiki = new Chicken("Кики", 30, -1, 5);

        Penguin lolo = new Penguin("Лоло", -1, 10000, -1);
// разобраться с тем, что ниже:
    //    Array[] animals = new Array[] {dogLord, dogTerry, catKitty, tigerSunny, suslikGuf, kiki, lolo};
    //    for (Array animal: animals){
    //        if (animal.running > 0)
    //    }


    }

    public void run(int animalRunner){

           System.out.println("");

//           return animalRunner;
    }

}

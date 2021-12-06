package lesson7;

public class Dog {
    String name;
    String breed; //порода
    int running; //бег (расстояние)
    int swimming; //плавание (расстояние)
    double height; //рост
    String color; //окрас
    double age; //возраст
    Boolean isTrainings; //наличие дрессировки

    public Dog(String name, String breed, int running, int swimming,
               double height, String color, double age, Boolean isTrainings) {
        this.name = name;
        this.breed = breed;//порода
        this.running = running;//бег (расстояние)
        this.swimming = swimming;//плавание (расстояние)
        this.height = height;//рост
        this.color = color;//возраст
        this.age = age;//наличие дрессировки
        this.isTrainings = isTrainings;
    }

    public Dog() {
        this.name = name;
        this.running = running;
        this.swimming = swimming;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunning() {
        return running;
    }

    public void setRunning(int running) {
        this.running = running;
    }

    public int getSwimming() {
        return swimming;
    }

    public void setSwimming(int swimming) {
        this.swimming = swimming;
    }
}
}

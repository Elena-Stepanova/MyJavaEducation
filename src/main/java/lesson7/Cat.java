package lesson7;

public class Cat {

    private String name;
    String breed; //порода
    int running; //бег (расстояние)
    int swimming; //плавание (расстояние)
    double height; //рост
    String color; //окрас
    double age; //возраст
    Boolean isTrainings; //наличие дрессировки



    public Cat(String name){
        this.name  = name;
//        String name;
//        String breed; //порода
//        int running; //бег (расстояние)
//        int swimming; //плавание (расстояние)
    }

    public Cat(String breed, int swimming, String color, Boolean isTrainings) {
        this.breed = breed;
        this.swimming = swimming;
        this.color = color;
        this.isTrainings = isTrainings;
    }

    public Cat(String name, String breed, int running, int swimming, double height, String color, double age, Boolean isTrainings) {
        this.name = name;
        this.breed = breed;
        this.running = running;
        this.swimming = swimming;
        this.height = height;
        this.color = color;
        this.age = age;
        this.isTrainings = isTrainings;
    }


}

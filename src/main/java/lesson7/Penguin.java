package lesson7;

public class Penguin {
    private String name;
    String breed; //порода
    int running; //бег (расстояние)
    int swimming; //плавание (расстояние)
    int flying; //дальность полета
    double height; //рост
    String color; //окрас
    double age; //возраст
    Boolean isTrainings; //наличие дрессировки

    public Penguin(String name, int running, int swimming, int flying) {
        this.name = name;
        this.running = running;
        this.swimming = swimming;
        this.flying = flying;
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

    public int getFlying() {
        return flying;
    }

    public void setFlying(int flying) {
        this.flying = flying;
    }
}

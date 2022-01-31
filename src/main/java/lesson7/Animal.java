package lesson7;

public class Animal {
    private String name;
    private int running;
    private int swimming;

    public Animal (String name, int running, int swimming){
        this.name = name;
        this.running = running;
        this.swimming = swimming;
    }

    public String getName() {
        return name;
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

    public void swim(int distance){
        if (this.swimming > 0) {
            if (distance <= this.swimming) {
                System.out.printf("%s проплыл(а) %d метров\n", this.name, distance);
            } else {
                System.out.printf("%s проплыл(а) %d метров из %d и устал(а)\n", this.name, this.swimming, distance);
            }
        } else {
            System.out.printf("%s не может плавать\n", this.name);
        }
    }

    public void run(int distance){
        if (this.running > 0) {
            if (distance <= this.running) {
                System.out.printf("%s пробежал(а) %d метров\n", this.name, distance);
            } else {
                System.out.printf("%s пробежал(а) %d метров из %d и устал(а)\n", this.name, this.running, distance);
            }
        } else {
            System.out.printf("%s не может бегать\n", this.name);
        }
    }
}

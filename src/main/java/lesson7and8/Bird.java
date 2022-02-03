package lesson7and8;

public class Bird extends Animal {

    public Bird(String name, int running, int swimming, String sound) {
        super(name, running, swimming, sound);
    }

    public void fly() {
        System.out.printf("%s умеет летать\n", this.getName());}

    public void signal(int times) {
        System.out.printf("%s прокурлыкал %d раз(а)\n", this.getName(), times);
    }
}

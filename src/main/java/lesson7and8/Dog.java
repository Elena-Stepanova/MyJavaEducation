package lesson7and8;

public class Dog extends Animal {
    public Dog (String name, int running, int swimming, String sound) {
        super(name, running, swimming, sound);
    }

    public void bark(int times){
        System.out.printf("%s пролаял(а) %d раз(а)\n", this.getName(), times);
    }
}

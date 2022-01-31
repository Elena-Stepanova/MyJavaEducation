package lesson7;

public class Dog extends Animal {
    public Dog (String name, int running, int swimming) {
        super(name, running, swimming);
    }

    public void bark(int times){
        System.out.printf("%s пролаял(а) %d раз(а)\n", this.getName(), times);
    }
}

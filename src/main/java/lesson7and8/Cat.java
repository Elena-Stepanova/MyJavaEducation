package lesson7and8;

public class Cat extends Animal {
    public Cat(String name, int running, int swimming, String sound) {
        super(name, running, swimming, sound);
    }

    public void mew(int times){
        System.out.printf("%s промяукал(а) %d раз(а)\n", this.getName(), times);
    }

    public void purr(){
        System.out.printf("%s промурчал(а)\n", this.getName());
    }

    public void hiss(){
        System.out.printf("%s зашипел(а)\n", this.getName());
    }
}
package lesson7and8;

public class BigCat extends Cat {
    public BigCat(String name, int running, int swimming, String sound) {
        super(name, running, swimming, sound);
    }

    public void roar() {

        System.out.printf("%s громко рычит\n", this.getName());
    }
}

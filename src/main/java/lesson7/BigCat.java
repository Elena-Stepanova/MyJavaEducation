package lesson7;

public class BigCat extends Cat {
    public BigCat(String name, int running, int swimming) {
        super(name, running, swimming);
    }

    public void roar() {
        System.out.printf("%s громко рычит\n", this.getName());
    }
}

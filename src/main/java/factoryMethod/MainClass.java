package factoryMethod;

/**
 * 工厂方法模式
 */
public class MainClass {
    public static void main(String[] args) {
        FruitFactory factory = new AppleFactory();
        Fruit fruit = factory.getFruit();
        System.out.println(fruit.get());

        FruitFactory factory1 = new BananaFactory();
        Fruit fruit1 = factory1.getFruit();
        System.out.println(fruit1.get());

    }
}

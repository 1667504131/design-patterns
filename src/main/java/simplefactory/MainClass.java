package simplefactory;

/**
 * 简单工厂模式
 */
public class MainClass {
    public static void main(String[] args) {
        Fruit fruit = FruitFactory.getFruit("Apple");
       System.out.println(fruit.get());

    }
}

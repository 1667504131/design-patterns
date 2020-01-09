package simplefactory;

public class FruitFactory {
    public static Fruit getFruit(String type){
        if ("Apple".equals(type)){
            return new Apple();
        }else if ("Banana".equals(type)){
            return new Banana();
        }
        return null;
    }
}

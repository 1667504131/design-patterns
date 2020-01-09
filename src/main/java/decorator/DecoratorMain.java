package decorator;

/**
 * @ProjectName: design-patterns-demo
 * @Package: decorator
 * @Description: 装饰模式
 * @Author: DongJW
 * @CreateDate: 2020/1/10 0:20
 * @Version: 1.0
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Car car = new RunCar();
        car.show();
        System.out.println("-----------------------------------------------");
        CarDecorator flyCarDecorator = new FlyCarDecorator(car);
        flyCarDecorator.show();
        System.out.println("-----------------------------------------------");
        CarDecorator swimCarDecorator = new SwimCarDecorator(car);
        swimCarDecorator.show();

        System.out.println("-----------------------------------------------");
        CarDecorator swinAndFlyAndRun = new SwimCarDecorator(flyCarDecorator);
        swinAndFlyAndRun.show();

    }


}

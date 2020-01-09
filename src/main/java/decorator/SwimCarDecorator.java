package decorator;

/**
 * @ProjectName: design-patterns-demo
 * @Package: decorator
 * @Description:
 * @Author: DongJW
 * @CreateDate: 2020/1/10 0:45
 * @Version: 1.0
 */
public class SwimCarDecorator extends CarDecorator {

    public SwimCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {

    }

    @Override
    public void show() {
        this.getCar().show();
        this.swim();
    }

    public void swim(){
        System.out.println("可以游泳");
    }
}

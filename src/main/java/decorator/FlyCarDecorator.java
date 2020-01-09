package decorator;

/**
 * @ProjectName: design-patterns-demo
 * @Package: decorator
 * @Description:
 * @Author: DongJW
 * @CreateDate: 2020/1/10 0:36
 * @Version: 1.0
 */
public class FlyCarDecorator extends CarDecorator {
    public FlyCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {

    }

    @Override
    public void show() {
        this.getCar().show();
        this.fly();
    }

    public void fly(){
        System.out.println("可以飞");
    }
}

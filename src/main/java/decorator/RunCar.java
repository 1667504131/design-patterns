package decorator;

/**
 * @ProjectName: design-patterns-demo
 * @Package: decorator
 * @Description:
 * @Author: DongJW
 * @CreateDate: 2020/1/10 0:27
 * @Version: 1.0
 */
public class RunCar implements Car {
    @Override
    public void run() {
        System.out.println("可以跑");
    }

    @Override
    public void show() {
        System.out.println("拥有的功能");
        this.run();
    }
}

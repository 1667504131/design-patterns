package decorator;

/**
 * @ProjectName: design-patterns-demo
 * @Package: decorator
 * @Description:
 * @Author: DongJW
 * @CreateDate: 2020/1/10 0:35
 * @Version: 1.0
 */
public abstract class CarDecorator implements Car{

    private Car car;


    public CarDecorator(Car car){
        this.car= car;
    }

    public abstract void show();

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}

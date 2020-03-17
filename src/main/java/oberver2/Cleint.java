package oberver2;

public class Cleint {

    public static void main(String[] args) {

        //创建目标对象
        ConcreteSubject concreteSubject = new ConcreteSubject();

        //创建观察者
        ObserverA observer1 = new ObserverA();
        ObserverA observer2 = new ObserverA();
        ObserverA observer3 = new ObserverA();

        //将观察者加入目标对象的观察者容器中
        concreteSubject.addObserver(observer1);
        concreteSubject.addObserver(observer2);
        concreteSubject.addObserver(observer3);

        //改变目标对象状态
        concreteSubject.setState(100);
        System.out.println("observer1   "+ observer1.getMyState());
        System.out.println("observer2   "+ observer2.getMyState());
        System.out.println("observer3   "+ observer3.getMyState());

        System.out.println("================================ ");
        concreteSubject.deleteObserver(observer2);
        //改变目标对象状态
        concreteSubject.setState(300);
        System.out.println("observer1   "+ observer1.getMyState());
        System.out.println("observer2   "+ observer2.getMyState());
        System.out.println("observer3   "+ observer3.getMyState());
    }
}

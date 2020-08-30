package observer;

public class Cleint {
    public static void main(String[] args) {
        //被观察对象
        ConcreteSubject concreteSubject = new ConcreteSubject();

        //创建多个观察者
        Observer observer1 = new ObserverA();
        Observer observer2 = new ObserverA();
        Observer observer3 = new ObserverA();

        //将观察者加入到被观察对象的观察者队伍中
        concreteSubject.register(observer1);
        concreteSubject.register(observer2);
        concreteSubject.register(observer3);

        //改变被观察者对象的状态
        concreteSubject.setState(4);

        //查出观察者对象状态
        System.out.println("observer1   "+((ObserverA) observer1).getMyState());
        System.out.println("observer2   "+((ObserverA) observer2).getMyState());
        System.out.println("observer3   "+((ObserverA) observer3).getMyState());

        System.out.println("================================================= ");

        //移除observer3
        concreteSubject.removeObserver(observer3);
        //修改被观察对象的状态
        concreteSubject.setState(5);
        System.out.println("observer1   "+((ObserverA) observer1).getMyState());
        System.out.println("observer2   "+((ObserverA) observer2).getMyState());
        System.out.println("observer3   "+((ObserverA) observer3).getMyState());
    }
}

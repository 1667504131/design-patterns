package oberver2;

import java.util.Observable;

/**
 * 目标对象
 */
public class ConcreteSubject extends Observable {

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;//目标对象状态发生了改变
        setChanged();//表示目标对象已经做了更改
        notifyObservers(state);//通知所有观察者
    }
}

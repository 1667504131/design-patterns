package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察对象
 */
public class Subject {
    private List<Observer> list =new ArrayList<>();

    //新增观察者
    public void register(Observer observer){
        list.add(observer);
    }

    //删除观察者
    public void removeObserver(Observer observer){
        list.remove(observer);
    }

    //通知所有的观察者更新状态
    public void notifyAllObserver(){
        for (Observer observer : list) {
            observer.update(this);
        }
    }
}

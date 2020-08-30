package adapter;

/**
 * @ProjectName: design-patterns-demo
 * @Package: adapter
 * @Description: 适配器（相当于USB和圆接口的转换器）
 * @Author: DongJW
 * @CreateDate: 2020/3/15 15:58
 * @Version: 1.0
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleReq() {
        adaptee.request();
    }
}

package adapter;

/**
 * @ProjectName: design-patterns-demo
 * @Package: adapter
 * @Description: 被适配的类（相当于圆孔键盘）
 * @Author: DongJW
 * @CreateDate: 2020/3/15 15:53
 * @Version: 1.0
 */
public class Adaptee {
    public void request(){
        System.out.println("可以完成客户需要的打字功能！");
    }
}

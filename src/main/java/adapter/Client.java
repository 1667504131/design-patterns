package adapter;

/**
 * @ProjectName: design-patterns-demo
 * @Package: adapter
 * @Description: 相当于笔记本的USB接口
 * @Author: DongJW
 * @CreateDate: 2020/3/15 15:56
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        client.test1(target);
        System.out.println("这是我创建的一个devvv分支");
        System.out.println("这是我创建的一个devvv分支3");
    }

    public void test1(Target target){
        target.handleReq();
    }
}

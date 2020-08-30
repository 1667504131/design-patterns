package abstractFactory;

/**
 * @ProjectName: design-patterns-demo
 * @Package: abstractFactory
 * @Description:
 * @Author: DongJW
 * @CreateDate: 2020/3/11 22:53
 * @Version: 1.0
 */
public class MiWatch implements Watch {
    @Override
    public void getWatch() {
        System.out.println("小米手表");
    }
}

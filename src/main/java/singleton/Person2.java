package singleton;

/**
 * @ProjectName: design-patterns
 * @Package: com.it.designPatterns.singleton
 * @Description:
 * @Author: DongJW
 * @CreateDate: 2020/1/8 23:41
 * @Version: 1.0
 */
public class Person2 {

    private static  Person2 person;

    private String naem;

    public String getNaem() {
        return naem;
    }

    public void setNaem(String naem) {
        this.naem = naem;
    }

    private Person2(){
    }


    /**
     *是否 Lazy 初始化：是
    *是否多线程安全：是
   *实现难度：易
   *描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
   *优点：第一次调用才初始化，避免内存浪费。
   *缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
   *getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
     * @return
     */
    public static Person2 getInstance(){
        //没有再创建
        if (null==person){
            person = new Person2();
        }
        return person;
    }
}

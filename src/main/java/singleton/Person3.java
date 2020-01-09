package singleton;

/**
 * @ProjectName: design-patterns
 * @Package: com.it.designPatterns.singleton
 * @Description:
 * @Author: DongJW
 * @CreateDate: 2020/1/8 23:41
 * @Version: 1.0
 */
public class Person3 {

    private static Person3 person;

    private String naem;

    public String getNaem() {
        return naem;
    }

    public void setNaem(String naem) {
        this.naem = naem;
    }

    private Person3(){
    }


    /**
     * 线程安全的懒汉式
     * @return
     */
    public static Person3 getInstance(){
        //没有再创建
        if (null==person){
            synchronized (Person3.class){
                if (null==person){
                    person = new Person3();
                }
            }
        }
        return person;
    }
}

package singleton;

/**
 * @ProjectName: design-patterns
 * @Package: com.it.designPatterns.singleton
 * @Description:
 * @Author: DongJW
 * @CreateDate: 2020/1/8 23:41
 * @Version: 1.0
 */
public class Person {

    private static final Person person = new Person();

    private String naem;

    public String getNaem() {
        return naem;
    }

    public void setNaem(String naem) {
        this.naem = naem;
    }

    private Person(){
    }

    /**
     * 提供一个全局的静态方法
     * @return
     */
    public static Person getPerson(){
        return person;
    }
}

package prototype;

import java.util.List;

/**
 * @ProjectName: design-patterns
 * @Package: com.it.designPatterns.prototype
 * @Description:
 * @Author: DongJW
 * @CreateDate: 2020/1/9 0:22
 * @Version: 1.0
 */
public class Person2 implements Cloneable{

    private String name;

    private int age;

    private String sex;

    private List<String> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 深度克隆
     * @return
     */
    public Person2 clone(){
        try {
            //Person2 person2 =
            return (Person2) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

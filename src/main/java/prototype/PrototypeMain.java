package prototype;

/**
 * @ProjectName: design-patterns
 * @Package: com.it.designPatterns.prototype
 * @Description:
 * @Author: DongJW
 * @CreateDate: 2020/1/9 0:23
 * @Version: 1.0
 */
public class PrototypeMain {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("王五");
        person.setAge(25);
        person.setSex("男");

        /**
         * Person person2 = person;
         * 引用指向的都是同一个对象
         * 用clone的话具有相同的数据，不是同一个对象
         */
        Person person2 = person.clone();
        person2.setName("刘丽");
        person2.setAge(25);
        person2.setSex("女");


    }


}

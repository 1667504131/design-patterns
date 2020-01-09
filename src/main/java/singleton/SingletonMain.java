package singleton;

/**
 * @ProjectName: design-patterns
 * @Package: com.it.designPatterns.singleton
 * @Description:
 * @Author: DongJW
 * @CreateDate: 2020/1/8 23:44
 * @Version: 1.0
 */
public class SingletonMain {

    public static void main(String[] args) {

        //饿汉式
        Person person = Person.getPerson();
        person.setNaem("list");
        Person person1 = Person.getPerson();
        person1.setNaem("zhangsan");

        System.out.println(person.getNaem());
        System.out.println(person1.getNaem());

        //懒汉式
        Person2 person2 =Person2.getInstance();
        person2.setNaem("lisi");
        Person2 person3 =Person2.getInstance();
        person3.setNaem("zhangsan");

        System.out.println(person2.getNaem());
        System.out.println(person3.getNaem());

    }
}

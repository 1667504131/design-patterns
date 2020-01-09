package buildrer;

/**
 * @ProjectName: design-patterns-demo
 * @Package: buildrer
 * @Description: 建造者模式
 * @Author: DongJW
 * @CreateDate: 2020/1/9 23:32
 * @Version: 1.0
 */
public class MainClass {
    public static void main(String[] args) {

        //工程队
        HouseBuilder houseBuilder = new PingFangBuilder();
        //设计师
        HouseDirector houseDirector = new HouseDirector();
        //建造房子
        houseDirector.makeHouse(houseBuilder);
        //获取房子
        House house = houseBuilder.getHouse();

        System.out.println(house.getFloor());
    }
}

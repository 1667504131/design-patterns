package buildrer;

/**
 * @ProjectName: design-patterns-demo
 * @Package: buildrer
 * @Description: 建造者
 * @Author: DongJW
 * @CreateDate: 2020/1/9 23:57
 * @Version: 1.0
 */
public class HouseDirector {


    public void makeHouse(HouseBuilder builder){
        builder.makeFloor();
        builder.makeHousetop();
        builder.makeWall();
    }

}

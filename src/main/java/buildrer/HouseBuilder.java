package buildrer;

/**
 * @ProjectName: design-patterns-demo
 * @Package: buildrer
 * @Description:
 * @Author: DongJW
 * @CreateDate: 2020/1/9 23:36
 * @Version: 1.0
 */
public interface HouseBuilder {
    //修地板
    public void makeFloor();

    //修屋顶
    public void makeHousetop();

    //修墙
    public void makeWall();

    //整
    public House getHouse();
}

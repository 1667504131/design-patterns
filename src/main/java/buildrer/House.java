package buildrer;

/**
 * @ProjectName: design-patterns-demo
 * @Package: buildrer
 * @Description: 建造者模式
 * @Author: DongJW
 * @CreateDate: 2020/1/9 23:33
 * @Version: 1.0
 */
public class House {

    //地板
    private String floor;

    //屋顶
    private String housetop;

    //墙
    private String wall;

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getHousetop() {
        return housetop;
    }

    public void setHousetop(String housetop) {
        this.housetop = housetop;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }
}

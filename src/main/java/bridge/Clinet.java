package bridge;

public class Clinet {
    public static void main(String[] args) {
        JiaDian jiaDian = new BingXiang();
        MeiDi meiDi = new MeiDi(jiaDian);
        System.out.println(meiDi.description());
        GeLi geLi = new GeLi(jiaDian);
        System.out.println(geLi.description());
    }
}

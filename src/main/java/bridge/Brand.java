package bridge;

public abstract class Brand {

    protected JiaDian jiaDian;

    public Brand(JiaDian jiaDian){
        this.jiaDian=jiaDian;
    }
    //品牌描述
    abstract String description();
}

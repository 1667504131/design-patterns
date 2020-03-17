package bridge;

public class MeiDi extends Brand {

    public MeiDi(JiaDian jiaDian){
        super(jiaDian);
    }

    @Override
    public String description() {
        return "美的"+jiaDian.description();
    }
}

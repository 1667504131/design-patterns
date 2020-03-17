package bridge;

public class GeLi extends Brand {

    public GeLi(JiaDian jiaDian) {
        super(jiaDian);
    }

    @Override
    String description() {
        return "格力" + jiaDian.description();
    }
}

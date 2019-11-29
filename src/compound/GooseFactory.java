package compound;

public class GooseFactory {
    public Quackable createGoose(){
        return new GooseAdapter(new Goose());
    }
}

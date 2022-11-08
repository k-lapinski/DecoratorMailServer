import java.util.LinkedList;

public class ChangeOnStar extends Dekorator  {

    public ChangeOnStar(InterfaceMailServer message) {
        super(message);
    }

    public String changeOnStars(String msg) {
        return "************";
    }

    public String read(){

        return super.read();
    }
    public void send(String msg){

        super.send(changeOnStars(msg));
    }
}

import java.util.LinkedList;
import java.util.List;

public class MailServer implements InterfaceMailServer {
    List<String> mail = new LinkedList<String>();
    int i = 0;

    @Override
    public void send(String msg){

        mail.add(msg);
    }
    @Override
    public String read(){
        i++;
        return mail.get(i-1);
    }
}
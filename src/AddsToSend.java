import java.util.Date;

class AddsToSend extends Dekorator {
    public AddsToSend(InterfaceMailServer message){

        super(message);
    }
    public void send(String msg){

        super.send(addStatus(msg));
    }
    public String read(){

        return super.read();
    }
    public String addStatus(String msg){

        Date date = new Date();

        return msg+". Sended: "+date;
    }
}
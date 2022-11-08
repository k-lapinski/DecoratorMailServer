import java.util.Date;

class AddsToRead extends Dekorator {
    public AddsToRead(InterfaceMailServer message){

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

        return msg+ ". Received: "+date;
    }
}
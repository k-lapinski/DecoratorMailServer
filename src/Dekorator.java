abstract class Dekorator implements InterfaceMailServer {
     InterfaceMailServer mess;
    public Dekorator(InterfaceMailServer message){

        this.mess = message;
    }
    public void send(String a){
        mess.send(a);
    }
    public String read(){
        return mess.read();}
}
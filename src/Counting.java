class Counting extends Dekorator {

    int i=1;

    public Counting(InterfaceMailServer message){

        super(message);
    }

    public void send(String msg){

        super.send(counting(msg));
    }

    public String read(){

        return super.read();
    }

    public String counting(String msg){
        String indexWithMsg =  i+"."+msg;
        i++;
        return indexWithMsg;
    }
}

public class Main {
    public static void main(String[] args) {

        InterfaceMailServer interfaceMailServer = new AddsToSend(new AddsToRead(new Counting(new MailServer())));
        interfaceMailServer.send("Test First message");
        interfaceMailServer.send("Test Second message");
        interfaceMailServer.send("Test Third message");
        System.out.println(interfaceMailServer.read());
        System.out.println(interfaceMailServer.read());
        System.out.println(interfaceMailServer.read());
        System.out.println("zamiana na gwiazdki:");
        InterfaceMailServer interfaceMailServerStars = new ChangeOnStar(new AddsToSend(new AddsToRead(new Counting(new MailServer()))));
        interfaceMailServerStars.send("Test star message");
        System.out.println(interfaceMailServerStars.read());
        System.out.println("zamiana na szyfr + odszyfrowanie:");
        InterfaceMailServer interfaceMailServerEncryption = new AES(new AddsToSend(new AddsToRead(new Counting(new MailServer()))));
        interfaceMailServerEncryption.send("Test encrypt message");
        System.out.println(interfaceMailServerEncryption.read());
    }



}




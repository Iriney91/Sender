package Sender;

public class Email <M>implements SendMessage <M> {

    public void send(M message) {
        System.out.println(message);

    }
}

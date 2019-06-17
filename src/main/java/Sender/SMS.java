package Sender;

public class SMS <M> implements SendMessage <M>{

    public void send(M message) {
        System.out.println(message);
    }
}

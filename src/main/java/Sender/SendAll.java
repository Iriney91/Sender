package Sender;

public class SendAll <M> implements SendMessage <M>{

    public void send(M send) {
        for (TypeMessage type: TypeMessage.values()) {

            try {
                MessageFactory.createSendMessage(type).send(send);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
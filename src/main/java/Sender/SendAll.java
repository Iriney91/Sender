package Sender;

public class SendAll implements SendMessage {

    public void send(String send) {
        for (TypeMessage type: TypeMessage.values()) {

            try {
                MessageFactory.createSendMessage(type).send(send);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
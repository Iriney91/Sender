package Sender;

import java.util.ArrayList;

public class MultiMessage <M> implements SendMessage <M> {

    private  ArrayList<SendMessage> messages;

    public MultiMessage (TypeMessage... messages) throws Exception {
        this.messages = MessageFactory.createSendMessageList(messages);
    }
    public void send(M send) throws Exception {

        for (SendMessage message: messages) {
            message.send(send);
        }
    }
}

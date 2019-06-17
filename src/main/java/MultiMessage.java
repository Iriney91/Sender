
import java.util.ArrayList;

public class MultiMessage implements SendMessage {

    private TypeMessage[] types;

    public void send(String send) {
        ArrayList<SendMessage> messages;

        messages = MessageFactory.createSendMessageList(types);

        for (SendMessage message: messages) {
            message.send("ssss");
        }
    }
}

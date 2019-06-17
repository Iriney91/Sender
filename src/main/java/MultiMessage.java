
import java.util.ArrayList;

public class MultiMessage implements SendMessage {

    private  ArrayList<SendMessage> messages;

    public MultiMessage (ArrayList <SendMessage> messages){
        this.messages = messages;
    }
    public void send(String send) throws Exception {

        for (SendMessage message: messages) {
            message.send(send);
        }
    }
}

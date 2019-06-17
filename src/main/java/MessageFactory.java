import java.util.ArrayList;

public class MessageFactory {

    public static SendMessage createSendMessage(TypeMessage typeMessage) throws Exception {

        switch (typeMessage) {

            case SMS:
                return new SMS();

            case EMAIL:
                return new Email();

            default:
                throw new Exception("несуществующий тип");
        }
    }

    public static ArrayList<SendMessage> createSendMessageList(TypeMessage... typeMessages) {

        ArrayList<SendMessage> messages = new ArrayList<SendMessage>();

        for (TypeMessage type : typeMessages) {
//            messages.add(createSendMessage(type));
        }

        return messages;
    }

}
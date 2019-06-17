package Sender;

public class Main {

    public static void main(String[] args) throws Exception {

        SendMessage message = MessageFactory.createSendMessage(TypeMessage.EMAIL);
        SendMessage message2 = MessageFactory.createSendMessage(TypeMessage.SMS);

       // System.out.println(message);
       // System.out.println(message2);

        MultiMessage multiMessage = new MultiMessage(MessageFactory.createSendMessageList(TypeMessage.EMAIL, TypeMessage.SMS));

        multiMessage.send("///");
        System.out.println(multiMessage);


    }
}

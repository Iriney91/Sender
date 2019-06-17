public class Main {

    public static void main(String[] args) {

        SendMessage message = MessageFactory.createMessage(TypeMessage.EMAIL);
        SendMessage message2 = MessageFactory.createMessage(TypeMessage.SMS);

        System.out.println(message);
        System.out.println(message2);

    }
}

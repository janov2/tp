public class Main {
    public static void main(String[] args) {

        MessagingService service = new MessagingService();

        Message msg1 = new Message("Alice", "Hi Bob, do you want to play tennis?");
        Message msg2 = new Message("Bob", "Yes, let's meet at the tennis court on Monday morning.");
        Message msg3 = new Message("Alice", "Ok, see you");

        service.add(msg1);
        service.add(msg2);
        service.add(msg3);

        System.out.println("Conversation history:");
        for (Message m : service.getMessages()) {
            System.out.println(m);
        }
    }
}
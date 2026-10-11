import java.util.ArrayList;
import java.util.List;

public class MessagingService {

    private List<Message> list;

    public MessagingService() {
        this.list = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.list.add(message);
        }
    }

    public List<Message> getMessages() {
        return this.list;
    }
}
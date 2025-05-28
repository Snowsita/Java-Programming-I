import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> lists;

    public MessagingService() {
        this.lists = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.lists.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return lists;
    }
}

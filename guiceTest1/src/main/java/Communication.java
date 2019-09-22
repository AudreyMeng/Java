import com.google.inject.Inject;

public class Communication {

    @Inject
    private Communicator communicator;

    public boolean sendMsg(String msg) {
        return communicator.sendMessage(msg);
    }
}

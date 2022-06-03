package Builder.com.Messages;

public class TaskAddedMobileMessage implements buildMessage {
    @Override
    public String prepareMessage(String placeHolders[]) {
        // code to replace placeholders of this type
        String preparedMessage = "";
        for (String s : placeHolders)
            preparedMessage += s;

        return preparedMessage;
    }


    public void addTeamDescription() {

    }
}

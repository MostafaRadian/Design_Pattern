package Builder.com.Messages;

public class DailyNewsMobileMessage implements buildMessage {
    @Override
    public String prepareMessage(String placeHolders[]) {
        String preparedMessage = "";
        for (String s : placeHolders)
            preparedMessage += s;

        return preparedMessage;
    }
}

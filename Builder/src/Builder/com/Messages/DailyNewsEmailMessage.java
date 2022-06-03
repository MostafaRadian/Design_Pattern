package Builder.com.Messages;

public class DailyNewsEmailMessage implements buildMessage {
    @Override
    public String prepareMessage(String placeHolders[]) {
        // code to replace placeholders of this type
        String preparedMessage = "";
        for (String s : placeHolders)
            preparedMessage += s;

        return preparedMessage;
    }
}

package Builder.com.Messages;

public class GradesAnnouncementEmailMessage implements buildMessage {
    @Override
    public String prepareMessage(String placeHolders[]) {
        String preparedMessage = "";
        for (String s : placeHolders)
            preparedMessage += s;

        return preparedMessage;
    }

    public boolean verifyGrades() {
        // code to verify Grades before announcement

        return true;
    }
}

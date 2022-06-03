package Builder.com.Gateways;

import Builder.com.Messages.DailyNewsEmailMessage;
import Builder.com.Messages.GradesAnnouncementEmailMessage;
import Builder.com.Messages.TaskAddedEmailMessage;

public class EmailGateway {

    public String sendMessage(Object message, String user) {
        String[] placeHolders = new String[]{}; // set some place holders here

        if (message instanceof DailyNewsEmailMessage) {
            DailyNewsEmailMessage dailyNewsEmailMessage = (DailyNewsEmailMessage) message;

            return dailyNewsEmailMessage.prepareMessage(placeHolders);

            // some code to send message
        } else if (message instanceof GradesAnnouncementEmailMessage) {
            GradesAnnouncementEmailMessage announcementEmailMessage = (GradesAnnouncementEmailMessage) message;

            return announcementEmailMessage.prepareMessage(placeHolders);

            // some code to send message
        } else if (message instanceof TaskAddedEmailMessage) {
            TaskAddedEmailMessage addedEmailMessage = (TaskAddedEmailMessage) message;

            return addedEmailMessage.prepareMessage(placeHolders);

            // some code to send message by email to user
        }
        return "No new message";
    }


}

package Builder.com.Gateways;

import Builder.com.Messages.DailyNewsMobileMessage;
import Builder.com.Messages.GradesAnnouncementMobileMessage;
import Builder.com.Messages.TaskAddedMobileMessage;

public class SMSGateway {

    public String sendMessage(Object message, String user) {
        String[] placeHolders = new String[]{}; // set some place holders here

        if (message instanceof DailyNewsMobileMessage) {
            DailyNewsMobileMessage msg = (DailyNewsMobileMessage) message;

            return msg.prepareMessage(placeHolders);

            // some code to send message
        } else if (message instanceof GradesAnnouncementMobileMessage) {
            GradesAnnouncementMobileMessage msg = (GradesAnnouncementMobileMessage) message;

            return msg.prepareMessage(placeHolders);

            // some code to send message
        } else if (message instanceof TaskAddedMobileMessage) {
            TaskAddedMobileMessage msg = (TaskAddedMobileMessage) message;

            return msg.prepareMessage(placeHolders);

            // some code to send message to user
        }
        return "No new message";
    }
}

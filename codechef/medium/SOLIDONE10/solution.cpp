
// ================= EMAIL NOTIFICATION =================
/*
Responsibilities:
- Send email notifications
*/
class EmailNotification implements NotificationSender {

    @Override
    public void send(String recipient, String message) {

        System.out.println(
                "EMAIL sent to " +
                recipient +
                ": " +
                message
        );
}

    void send(String recipient, String message);
interface NotificationSender {

*/
Responsibilities:
- Represent generic notification sending behavior
/*
// ================= NOTIFICATION SENDER =================
import java.util.*;

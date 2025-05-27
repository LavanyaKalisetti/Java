package com.nt.RealtimeExamples;

class EmailNotifier implements Notifier {
    public void send(String msg) {
        System.out.println("Email sent: " + msg);
    }
}

class SmsNotifier implements Notifier {
    public void send(String msg) {
        System.out.println("SMS sent: " + msg);
    }
}

class PushNotifier implements Notifier {
    public void send(String msg) {
        System.out.println("Push Notification sent: " + msg);
    }
}



public class NotificationService {
	public void notifyUser(Notifier notifier,String msg) {
		notifier.send(msg);
	}
	public static void main(String[] args) {
        NotificationService service = new NotificationService();

        service.notifyUser(new EmailNotifier(), "Welcome to our app!");
        service.notifyUser(new SmsNotifier(), "Your OTP is 123456");
        service.notifyUser(new PushNotifier(), "You've got a new message");
    }
}


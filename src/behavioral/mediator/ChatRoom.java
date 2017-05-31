package behavioral.mediator;

public class ChatRoom {

	public static void showMessage(User user, String message) {
		System.out.println(message + " is received from " + user.getName());
	}

}

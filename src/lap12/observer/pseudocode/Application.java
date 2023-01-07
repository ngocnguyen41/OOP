package lap12.observer.pseudocode;

public class Application {
	public static void main(String[] args) {
		Editor editor = new Editor();

		LoggingListener logger = new LoggingListener("log.txt", "Someone has opened the file: %s");
		editor.events.subscribe("open", logger);

		EmailAlertsListener emailAlerts = new EmailAlertsListener("admin@example.com", "Someone has changed the file: %s");
		editor.events.subscribe("save", emailAlerts);

		editor.openFile("java.txt");

		try {
			editor.saveFile();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

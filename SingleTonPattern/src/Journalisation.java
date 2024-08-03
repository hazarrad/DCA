import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Journalisation {

	private static Journalisation uniqueInstance;
	private String log;

	public Journalisation() {
		log = new String();
	}

	public static synchronized Journalisation getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Journalisation();
		}
		return uniqueInstance;
	}

	public void ajouterLog(String log) {
		Date d = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH'h'mm");
		this.log += "[" + dateFormat.format(d) + "] " + log + "\n";
	}

	public String afficherLog() {
		return log;
	}

}


import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DBConnection {

	@Value("${DB_DRIVER_CLASS}")
	private String driverClass;
	@Value("${DB_URL}")
	private String dbURL;
	@Value("${DB_USERNAME}")
	private String userName;
	@Value("${DB_PASSWORD}")
	private char[] password;

	public DBConnection() {
	}

	public void printDBConfigs() {
		System.out.println("Driver Class = " + driverClass);
		System.out.println("DB URL = " + dbURL);
		System.out.println("User Name = " + userName);

		// Never do below in production environment :D
		System.out.println("Password = " + String.valueOf(password));
	}
}

public class spring6 {

	public static void main(String[] args) throws SQLException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.journaldev.spring");
		context.refresh();
		System.out.println("Refreshing the spring context");
		DBConnection dbConnection = context.getBean(DBConnection.class);

		dbConnection.printDBConfigs();
		
		// close the spring context
		context.close();
	}

}
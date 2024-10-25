package Week2;

public class JavaConnection extends MySqlConnection implements DatabaseConnection{

	public static void main(String[] args) {
		
		//object creation
		JavaConnection j = new JavaConnection();
		j.connect();
		j.disconnect();
		j.executeUpdate();
		j.executeQuery();

	}

	@Override
	public void connect() {
		System.out.println("Connect Method");
	}

	@Override
	public void disconnect() {
		System.out.println("disConnect Method");

	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute update ");

	}

	@Override
	public void executeQuery() {
		System.out.println("Execute Query");

	}

}

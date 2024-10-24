package Week2;

public class APIClient {

	public void sendRequest(String endpoint)
	{
		System.out.println("The End Point is :" +endpoint);
	}

	public void sendRequest(String endpoint, String requestBody, boolean requestStatus)
	{
		System.out.println("Endpoint is : " +endpoint );
		System.out.println(	"Request Body is:" +requestBody );
		System.out.println(	"Request Status is:"  +requestStatus);
	}



	public static void main(String[] args) {


		APIClient a = new APIClient();

		a.sendRequest("/test");
		a.sendRequest("/authors", "http://www.testme.com/api/run/test", true);
	}

}

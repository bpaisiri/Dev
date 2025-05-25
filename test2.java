class test2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        System.out.println("The sum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + sum);
    }
}



FROM openjdk:23
WORKDIR /app
COPY test.java .
RUN javac test.java
CMD ["java","test"]

FROM python:3.12
WORKDIR /app
COPY test1.py Users/Palchander/Desktop/test/test1.py
CMD ["python","Users/Palchander/Desktop/test/test1.py"]


package vvce.nitk;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class demo1 {

		public static void main(String[] args) throws IOException, ParseException {
			JSONParser jsonparser = new JSONParser();
			FileReader reader = new FileReader(".\\JSON\\demo.json");
			Object obj = jsonparser.parse(reader);
			JSONObject empjsonobj = (JSONObject)obj;
			
			String fname = (String) empjsonobj.get("firstname");
			String lname = (String) empjsonobj.get("lastname");
			
			System.out.println("first name:"+fname);
			System.out.println("Last name:"+lname);
			
		}
}


modification

package vvce.testing;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class aisi {
	    public static void main(String[] args) {
	        Properties props = new Properties();
	        try {
	            // Load the properties file
	            FileInputStream fis = new FileInputStream("JDBC/abc.properties");
	            props.load(fis);

	            // Read the values
	            String firstName = props.getProperty("firstName");
	            String lastName = props.getProperty("lastName");

	            // Print output
	            System.out.println("First Name: " + firstName);
	            System.out.println("Last Name: " + lastName);

	            fis.close();
	        } catch (IOException e) {
	            System.out.println("Error reading properties file: " + e.getMessage());
	        }
	    }
	}

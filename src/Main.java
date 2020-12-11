import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
            Person person = null;
            try {
                person = gson.fromJson(new FileReader("file.gson"), Person.class);
            } catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
                e.printStackTrace();
            }
        System.out.println(person);
    }
}

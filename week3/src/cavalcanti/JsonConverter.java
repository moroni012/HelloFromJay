package cavalcanti;

public class JsonConverter {

import com.google.gson.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

    public class JsonParseTest {

        public static void main(String[] args) {

            List<Student> studentList = new ArrayList<Student>();

            try {

                JsonParseTest jasonStudent = new JsonParseTest();
                String jsonFilePath = "C:\\CS246-03\\week3Class\\gsontest\\src\\main\\resources\\student";

                BufferedReader br = new BufferedReader(new FileReader(jsonFilePath));
                String strCurrentLine;

                Gson gson = new Gson();

                while ((strCurrentLine = br.readLine()) != null) {
                    Student student = gson.fromJson(strCurrentLine, Student.class);
                    studentList.add(student);
                    System.out.println(strCurrentLine);
                }


                String jsonFilePathOut = "C:\\CS246-03\\week3Class\\gsontest\\src\\main\\resources\\studentsOut";
                FileWriter writer = new FileWriter(jsonFilePathOut);
                for (Student student : studentList ) {
                    String studentOut = gson.toJson(student);
                    writer.write(studentOut + "\n");
                }
                writer.close();
            }
            catch(Exception ex){
                System.out.println("help");
            }

            System.out.println("Hello students " + studentList.size());

        }
    }

}

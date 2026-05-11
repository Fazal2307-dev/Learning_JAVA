import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SalesFileReader {

    public void readFile() {

        String fileName =
                "C:\\SEM 6\\Kodwala_Acadmey\\KodeWala_Workspace\\Day30\\Day30\\src\\com\\kodewala\\ExceptionalHandling\\Sales_data.txt";

        try (BufferedReader br =
                     new BufferedReader(new java.io.FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {

                // Split using TAB
                String[] lineArr = line.split("\\t");

                // Safety check
                if (lineArr.length >= 4) {

                    String name = lineArr[0];
                    String address = lineArr[1];
                    String phone = lineArr[2];
                    String salesCount = lineArr[3];

                    System.out.println("Name : " + name);
                    System.out.println("Address : " + address);
                    System.out.println("Phone : " + phone);
                    System.out.println("Sales Count : " + salesCount);

                    System.out.println("------------------------");
                }
            }

        } catch (FileNotFoundException e) {

            System.out.println("File not found!");
            e.printStackTrace();

        } catch (IOException e) {

            System.out.println("Error while reading file!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        SalesFileReader fileReader = new SalesFileReader();

        fileReader.readFile();
    }
}
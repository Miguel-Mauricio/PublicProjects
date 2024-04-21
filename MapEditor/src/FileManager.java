import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;

import java.io.*;

public class FileManager {
    private static final String FILEPATH = "resources/map.txt";

    public static String readFile(){
      String result= "";
        BufferedReader reader = null;

        try{

            String line;
            reader= new BufferedReader(new FileReader(FILEPATH));
            while((line = reader.readLine()) != null){
                result += line + "\n";

            }
        }
        catch (IIOException | FileNotFoundException ex){
            System.err.println("Something is wrong...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            try{
                reader.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        return result;
    }
}

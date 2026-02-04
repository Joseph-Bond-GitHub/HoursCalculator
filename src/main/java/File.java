import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;

public class File {
    //Attributes
    private String fileName;
    private final String filePath = "/Users/Personal/Documents/GitHub/HoursSheet/";
    private Path fullPath;

    //constructor
    public File(String path){
        this.fileName = path;
        this.fullPath = Paths.get(this.filePath + this.fileName);
    }

    //setter
    public void setFileName(String fileName){
        this.fileName = fileName;
    }
    //getter
    public String getFileName(){
        return this.fileName;
    }

    //Other methods
    public Boolean write(String content){
        try{
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(fullPath, CREATE, APPEND));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));

            writer.write(content);
            writer.newLine();
        //add more fine-grained exception handling
        }catch(Exception e){
            System.out.println("Error initialising file writing tool");
            return false;
        }
        return true;
    }

    public void read(){

    }
    /*function to format the user entered data into a format that can be written to a file
    public String formatData(inputs){

    }
    */
    //Function needed to get the data from a specific line based on factors like date or hours worked etc.
}

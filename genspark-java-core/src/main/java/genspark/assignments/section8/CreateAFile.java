package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateAFile implements Assignment {

    public  void createAFile(){
        File file = new File("Sample_data.txt");

    }

    public void writeToAFile() throws IOException {
        try {
            FileWriter Writer = new FileWriter("Sample_data.txt");
            Writer.write("test");
            Writer.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public ArrayList readAFile () {
        ArrayList list = new ArrayList();
        try {
            File file = new File("Sample_data.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                String data = scanner.nextLine();
                for(int i = 0;i<data.length();i++){
                    list.add(data.charAt(i));
                }
            }
            scanner.close();
        }
        catch(IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        return list;
    }
}

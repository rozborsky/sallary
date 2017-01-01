package ua.rozborsky.classes;

import ua.rozborsky.interfaces.Employee;

import java.io.*;
import java.util.List;

/**
 * Created by roman on 31.12.2016.
 */
public class FileManager {
    String filename;

    public FileManager(String filename) {
        this.filename = filename + ".txt";
    }

    public void createFile(){
        File file = new File(filename);

        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("can't create file " + filename + ".txt");
                e.printStackTrace();
            }
        }
    }

    public void writeInFile(List employees) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {
            bw.write(createString(employees));
            System.out.println("employees was added to file " + filename);
        } catch (IOException e) {
            System.out.println("cant write data in file " + filename);
            e.printStackTrace();
        }
    }

    private String createString(List employees) {
        String data = "";
        for (int i = 0; i < employees.size(); i++) {
            data += ((Employee)(employees.get(i))).getId() + "\t\t" + ((Employee)(employees.get(i))).getName();
            int lengthWordInTabs = (((Employee)(employees.get(i))).getName().length()) / 4;

            for (int j = 0; j < 5 - lengthWordInTabs; j++) {
                data += "\t";
            }
            data += ((Employee)(employees.get(i))).getMonthlySalary() + "\n";
        }
        return data;
    }

    public void getEmployeesFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("cant read data from file");
            e.printStackTrace();
        }
    }


    public String handlingIncorrectFile(String filename) {
        String format = ".txt";
        if (!filename.endsWith(format)) {
            int dotPosition = filename.lastIndexOf('.');
            String name = filename.substring(0, dotPosition);
            filename = name + format;
        }

        return filename;
    }
}

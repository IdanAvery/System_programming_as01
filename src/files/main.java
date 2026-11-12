package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
        File info = new File("src/files/cs.txt");
        File grades = new File("src/files/hedva.txt");
        File report = new File("src/files/report.txt");

        try (
            Scanner csReader = new Scanner(info);
            Scanner gradesReader = new Scanner(grades);
            PrintWriter writer = new PrintWriter(report)
        ) {
            while (csReader.hasNext()) {
                // reading info
                String firstName = csReader.next();
                String lastName = csReader.next();
                String id = csReader.next();

                // reading hedva
                String gradeId = "";
                double g1 = 0;
                double g2 = 0;
                boolean hasGradeRecord = false;
                double avgGrades = 0.0;

                if (gradesReader.hasNext()) {
                    gradeId = gradesReader.next();
                    g1 = gradesReader.nextDouble();
                    g2 = gradesReader.nextDouble();
                    hasGradeRecord = true;
                }
                
                if (hasGradeRecord && gradeId.equals(id)) {
                    avgGrades = calcAVGgrade(id, g1, g2);
                };

                writer.println(id + "," + firstName + " " + lastName + " ," + avgGrades);
            }

            System.out.println("report.txt created successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("File error.");
            e.printStackTrace();
        }
    } 

    public static double calcAVGgrade(String id, double g1, double g2) {
        return (g1 + g2) / 2;
    } 

} 

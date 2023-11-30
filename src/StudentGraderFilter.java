import java.io.*;

public class StudentGraderFilter {
    public static void main(String[]args){
        String inputFile = "students (1).txt";
        String outputFile = "Students with 5.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))){

            String line;
            while ((line = reader.readLine())!= null){
                String[] studentData = line.split(",");
                String name = studentData[0];
                int grade = Integer.parseInt(studentData[1]);

                if (grade == 5){
                    writer.write(name + "," + grade);
                    writer.newLine();
                }
            }

            System.out.println("Students with grade 5 have been written to the file!");

        }catch (IOException e){
            System.out.println("An error occurred while processing the files.");
            e.printStackTrace();
        }
    }
}

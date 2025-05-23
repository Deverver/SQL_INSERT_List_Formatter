import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputFile = "Input.txt";
        String outputFile = "Output.txt";

        String startBlock = """
                INSERT INTO CATEGORY(?, ?)
                VALUES
                """;

        String contentStart = "(";
        String contentSeparator = ",";
        String contentValue02 = "5";
        String contentEnd = "),";

        String endBlock = ";";







        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line;
            while ((line = reader.readLine()) != null) {
                String formattedLine =  startBlock + contentStart + line + contentSeparator + contentEnd + endBlock;
                writer.write(formattedLine);
                writer.newLine();
            }

            System.out.println("Done writing formatted lines to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
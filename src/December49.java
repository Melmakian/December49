import java.io.*;
import java.util.ArrayList;

public class December49 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileNameOne = bufferedReader.readLine();
        String fileNameTwo = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileNameOne));
        ArrayList<String> list = new ArrayList<>();
        String nextLine;
        while ((nextLine = fileReader.readLine())!= null){
            list.add(nextLine);
        }
        fileReader.close();
        String[] worldArray;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String aString :list) {
            worldArray = aString.split(" ");
            for (String aWorldArray :worldArray) {
                try {
                    numbers.add(Integer.parseInt(aWorldArray));
                }catch (NumberFormatException ignored){

                }

            }

        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileNameTwo));
        for (Integer number:numbers) {bufferedWriter.write(number + " ");
            bufferedWriter.close();

        }

    }
}

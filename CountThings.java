import java.io.*;

public class CountThings {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;
            int words = 0;
            int characters = 0;
            int vowels = 0;
            while ((line = reader.readLine()) != null) {
                String[] wordsInLine = line.split(" ");
                words += wordsInLine.length;
                for (String word : wordsInLine) {
                    characters += word.length();
                    for (int i = 0; i < word.length(); i++) {
                        char c = word.charAt(i);
                        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                            vowels++;
                        }
                    }
                }
            }
            reader.close();
            System.out.println("Words: " + words);
            System.out.println("Characters: " + characters);
            System.out.println("Vowels: " + vowels);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
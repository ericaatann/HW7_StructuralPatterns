package Flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Create flyweight character properties
        CharacterProperties arialRed12 = CharacterPropertiesFactory.getCharacterProperties("Arial", "Red", 12);
        CharacterProperties calibriBlue14 = CharacterPropertiesFactory.getCharacterProperties("Calibri", "Blue", 14);
        CharacterProperties verdanaBlack16 = CharacterPropertiesFactory.getCharacterProperties("Verdana", "Black", 16);

        // Create a document and add characters with different properties
        Document document = new Document();
        document.addCharacter('H', arialRed12);
        document.addCharacter('e', calibriBlue14);
        document.addCharacter('l', verdanaBlack16);
        document.addCharacter('l', arialRed12);
        document.addCharacter('o', calibriBlue14);
        document.addCharacter(' ', verdanaBlack16);
        document.addCharacter('W', arialRed12);
        document.addCharacter('o', calibriBlue14);
        document.addCharacter('r', verdanaBlack16);
        document.addCharacter('l', arialRed12);
        document.addCharacter('d', calibriBlue14);

        // Save the document to a .txt file
        try {
            document.saveToFile("HelloWorldCS5800.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Load the document from the file and display its content
        try {
            BufferedReader reader = new BufferedReader(new FileReader("HelloWorldCS5800.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
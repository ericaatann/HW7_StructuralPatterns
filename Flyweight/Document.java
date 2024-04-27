package Flyweight;

import java.io.*;

public class Document implements Serializable {
    private static final long serialVersionUID = 1L;
    private StringBuilder text = new StringBuilder();

    public void addCharacter(char c, CharacterProperties properties) {
        text.append(c);
        System.out.println("Added character '" + c + "' with properties: " +
                properties.getFont() + ", " + properties.getColor() + ", " + properties.getSize());
    }

    public String getText() {
        return text.toString();
    }

    public void saveToFile(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(text.toString());
        }
    }

    public static Document loadFromFile(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Document) in.readObject();
        }
    }
}

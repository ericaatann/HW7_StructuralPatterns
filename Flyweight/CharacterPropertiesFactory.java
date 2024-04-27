package Flyweight;

public class CharacterPropertiesFactory {
    private static final java.util.Map<String, CharacterProperties> propertiesMap = new java.util.HashMap<>();

    public static CharacterProperties getCharacterProperties(String font, String color, int size) {
        String key = font + "_" + color + "_" + size;
        if (!propertiesMap.containsKey(key)) {
            propertiesMap.put(key, new CharacterProperties(font, color, size));
        }
        return propertiesMap.get(key);
    }
}

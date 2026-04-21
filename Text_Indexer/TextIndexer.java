import java.util.*;


public class TextIndexer {

    // Build index from text
    public static Map<String, List<Integer>> buildIndex(String text) {

        Map<String, List<Integer>> index = new HashMap<>();

        // Normalize text
        text = text.toLowerCase().replaceAll("[^a-z0-9 ]", "");

        String[] words = text.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            // Add word to index
            index.computeIfAbsent(word, k -> new ArrayList<>()).add(i);
        }

        return index;
    }

    // Print index
    public static void printIndex(Map<String, List<Integer>> index) {
        for (String word : index.keySet()) {
            System.out.println(word + " -> " + index.get(word));
        }
    }

    public static void main(String[] args) {

        String text = "Java is powerful. Java is widely used in software development.";

        Map<String, List<Integer>> index = buildIndex(text);

        System.out.println("Text Index:");
        printIndex(index);

        // Search example
        String searchWord = "java";
        System.out.println("\nSearch for '" + searchWord + "': " + index.get(searchWord));
    }
}
public class StringsPractice {
    public static void main(String[] args) {
        
        // ===== String හදන ක්‍රම =====
        System.out.println("===== String Creation =====");
        
        String s1 = "Kamal";                    // Literal
        String s2 = new String("Kamal");        // new keyword
        
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s1 == s2: " + (s1 == s2));        // false
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
        
        // ===== length() =====
        System.out.println("\n===== length() =====");
        
        String name = "Kamal";
        System.out.println("Length: " + name.length());  // 5
        
        String message = "Hello, World!";
        System.out.println("Message length: " + message.length());  // 13
        
        // ===== charAt() =====
        System.out.println("\n===== charAt() =====");
        
        System.out.println("charAt(0): " + name.charAt(0));  // K
        System.out.println("charAt(4): " + name.charAt(4));  // l
        
        // Loop එකක් එක්ක
        System.out.print("All chars: ");
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();
        
        // ===== substring() =====
        System.out.println("\n===== substring() =====");
        
        String msg = "Hello, World!";
        System.out.println("substring(0, 5): " + msg.substring(0, 5));   // Hello
        System.out.println("substring(7): " + msg.substring(7));         // World!
        System.out.println("substring(7, 12): " + msg.substring(7, 12)); // World
        
        // ===== equals() =====
        System.out.println("\n===== equals() =====");
        
        String a = "Kamal";
        String b = "Kamal";
        String c = "kamal";
        
        System.out.println("a.equals(b): " + a.equals(b));           // true
        System.out.println("a.equals(c): " + a.equals(c));           // false
        System.out.println("a.equalsIgnoreCase(c): " + a.equalsIgnoreCase(c));  // true
        
        // ===== split() =====
        System.out.println("\n===== split() =====");
        
        String fruits = "Apple,Banana,Mango,Orange";
        String[] arr = fruits.split(",");
        
        System.out.println("Count: " + arr.length);  // 4
        for (String fruit : arr) {
            System.out.println(fruit);
        }
        
        // CSV parse කරනවා
        String csv = "Kamal,22,Colombo";
        String[] data = csv.split(",");
        System.out.println("\nName: " + data[0]);
        System.out.println("Age: " + data[1]);
        System.out.println("City: " + data[2]);
        
        // ===== StringBuilder =====
        System.out.println("\n===== StringBuilder =====");
        
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.append("!");
        System.out.println(sb.toString());
        
        // Loop එකක් එක්ක
        StringBuilder numbers = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            numbers.append(i).append(" ");
        }
        System.out.println("Numbers: " + numbers.toString());
        
        // Reverse
        StringBuilder rev = new StringBuilder("Kamal");
        rev.reverse();
        System.out.println("Reversed: " + rev.toString());  // lamaK
        
        // ===== Useful Methods =====
        System.out.println("\n===== Useful Methods =====");
        
        String text = "  Hello World  ";
        System.out.println("Original: '" + text + "'");
        System.out.println("Trimmed: '" + text.trim() + "'");
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Replace: " + text.replace("World", "Java"));
        System.out.println("Contains 'Hello': " + text.contains("Hello"));
        System.out.println("Index of 'World': " + text.indexOf("World"));
    }
}

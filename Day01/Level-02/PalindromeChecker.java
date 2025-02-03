public class PalindromeChecker {
    // Attribute of the PalindromeChecker class
    private String text;

    // Constructor to initialize the PalindromeChecker object
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String normalizedText = text.replaceAll("\\s+", "").toLowerCase();
        int length = normalizedText.length();
        for (int i = 0; i < length / 2; i++) {
            if (normalizedText.charAt(i) != normalizedText.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is not a palindrome.");
        }
    }

    // Main method to test the PalindromeChecker class
    public static void main(String[] args) {
        // Creating a PalindromeChecker object
        PalindromeChecker checker1 = new PalindromeChecker("A man a plan a canal Panama");
        checker1.displayResult();

        PalindromeChecker checker2 = new PalindromeChecker("Hello World");
        checker2.displayResult();
    }
}

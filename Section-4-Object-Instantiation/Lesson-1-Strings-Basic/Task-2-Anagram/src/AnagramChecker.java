public class AnagramChecker {
    boolean isAnagram(String first, String second){
        String firstWithoutSpaces = first.replace(" ", "");
        String secondWithoutSpaces = second.replace(" ", "");
        if (firstWithoutSpaces.length() != secondWithoutSpaces.length()) {
            return false;
        }
        char[] firstArrayChars = firstWithoutSpaces.toCharArray();
        char[] secondArrayChars = secondWithoutSpaces.toCharArray();
        java.util.Arrays.sort(firstArrayChars);
        java.util.Arrays.sort(secondArrayChars);
        return java.util.Arrays.equals(firstArrayChars, secondArrayChars);
    };
}

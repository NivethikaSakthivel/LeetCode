class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        List<String> wordsList=Arrays.asList(words);
        Collections.reverse(wordsList);
        return String.join(" ",wordsList);
    }
}
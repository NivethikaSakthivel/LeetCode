class Solution {
    public int[] sumPrefixScores(String[] words) {
        int wordCount = words.length;
        Integer[] srtidx = new Integer[wordCount];
        for (int i = 0; i < wordCount; i++) {
            srtidx[i] = i;
        }
        Arrays.sort(srtidx, (a, b) -> words[a].compareTo(words[b]));
        
        int[] cpl = calculatecpl(words, srtidx);
        int[] scores = calculateScores(words, srtidx, cpl);
        return scores;
    }

    private int[] calculatecpl(String[] words, Integer[] srtidx) {
        int[] cpl = new int[words.length];
        for (int i = 1; i < words.length; i++) {
            String prevWord = words[srtidx[i - 1]];
            String currWord = words[srtidx[i]];
            int clen = 0;
            while (clen < prevWord.length() && clen < currWord.length() && prevWord.charAt(clen) == currWord.charAt(clen)) {
                clen++;
            }
            cpl[i] = clen;
        }
        return cpl;
    }

    private int[] calculateScores(String[] words, Integer[] srtidx, int[] cpl) {
        int[] scores = new int[words.length];
        for (int i = 0; i < srtidx.length; i++) {
            int wordIndex = srtidx[i];
            int wlen = words[wordIndex].length();
            scores[wordIndex] += wlen;
            int j = i + 1;
            int clen = wlen;
            while (j < words.length) {
                clen = Math.min(clen, cpl[j]);
                if (clen == 0) {
                    break;
                }
                scores[wordIndex] += clen;
                scores[srtidx[j]] += clen;
                j++;
            }
        }
        return scores;
    }
}
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        for (int i = 0; i < citations.length / 2; i++) {
            int temp = citations[i];
            citations[i] = citations[citations.length - 1 - i];
            citations[citations.length - 1 - i] = temp;
        }
        int i=0;
        for(int cite:citations){
            if(cite>=i+1){
                i++;
            }
            else{
                break;
            }
        }
        return i;
    }
}
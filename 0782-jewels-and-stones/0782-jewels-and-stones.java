class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> map=new HashSet<>();
        int count=0;
        for(char c:jewels.toCharArray()){
            map.add(c);
        }
        for(char i:stones.toCharArray()){
            if(map.contains(i)){
                count++;
            }
        }
        return count;
    }
}
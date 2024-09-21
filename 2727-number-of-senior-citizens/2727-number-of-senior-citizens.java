class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String s:details){
            int age1=Character.getNumericValue(s.charAt(11));
            int age2=Character.getNumericValue(s.charAt(12));
            if((age1*10)+age2>60){
                count++;
            }
        }
        return count;
    }
}
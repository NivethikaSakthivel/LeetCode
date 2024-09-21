class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int rulek;
        if(ruleKey.equals("type")) rulek=0;
        else if(ruleKey.equals("color")) rulek=1;
        else rulek=2;
        for(List<String> item:items){
            // for(String str:item){
                String str=item.get(rulek);
                if(str.equals(ruleValue)){
                    count++;
                }
            //}
        }
        return count;
    }
}
class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> minsList=new ArrayList<>();
        for(String time:timePoints){
            int hours=Integer.parseInt(time.substring(0,2));
            int mins=Integer.parseInt(time.substring(3,5));
            minsList.add(hours*60+mins);
        }
        Collections.sort(minsList);
        int minDiff=minsList.get(1)-minsList.get(0);
        for(int i=2;i<minsList.size();i++){
            minDiff=Math.min(minDiff,minsList.get(i)-minsList.get(i-1));
        }
        int firstLast=1440+minsList.get(0)-minsList.get(minsList.size()-1);
        minDiff=Math.min(minDiff,firstLast);
        return minDiff;
    }
}
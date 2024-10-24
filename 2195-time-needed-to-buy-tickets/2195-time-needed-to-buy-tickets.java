class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue=new LinkedList<>();
        int n=tickets.length;
        for(int i=0;i<n;i++){
            queue.add(i);
        } 
        int time=0;
        while(tickets[k]>0){
            int i=queue.poll();
            if(tickets[i]>0){
                tickets[i]--;
                time++;
                if(tickets[i]>0){
                    queue.add(i);
                }
            }
        }
        return time;
    }
}
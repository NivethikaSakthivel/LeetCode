class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long res=0,temp=(long)skill[0]+(long)skill[skill.length-1],sum=0;
        for(int i=0;i<skill.length/2;i++){
            long prod=(long)skill[i]*(long)skill[skill.length-i-1];
            sum=(long)skill[i]+(long)skill[skill.length-i-1];
            if(temp!=sum){
                return -1;
            }
            res+=prod;
        }
        return res;
    }
}
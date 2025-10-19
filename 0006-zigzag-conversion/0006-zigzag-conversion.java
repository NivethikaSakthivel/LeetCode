class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<=numRows) return s;
        StringBuilder[] sb=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++) sb[i]=new StringBuilder();
        int i=0;
        boolean goingDown=false;
        for(char c:s.toCharArray()){
            sb[i].append(c);
            if(i==0 || i==numRows-1){
                goingDown= !goingDown;
            }
            i+=goingDown?1:-1;
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder row:sb){
            res.append(row);
        }
        return res.toString();
    }
}
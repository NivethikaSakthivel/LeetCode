class Solution {
    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int n=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                n=n*10+(c-'0');
            }
            else if(c=='['){
                num.push(n);
                stack.push(curr);
                curr=new StringBuilder();
                n=0;
            }
            else if(c==']'){
                int repeat=num.pop();
                StringBuilder temp = curr;
                curr = stack.pop();   
                while(repeat-->0){
                    curr.append(temp);
                }
            }
            else {
                curr.append(c);
            }
        }
        return curr.toString();
    }
}
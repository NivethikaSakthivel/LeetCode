class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String s:tokens){
            if(!s.equals("-") && !s.equals("+") && !s.equals("*") && !s.equals("/")){
                stack.push(Integer.parseInt(s));
            }
            else{
                int ans=0;
                int val1=(stack.pop());
                int val2=(stack.pop());
                if(s.equals("+")){
                    ans=val1+val2;
                }
                else if(s.equals("-")){
                    ans=val2-val1;
                }
                else if(s.equals("*")){
                    ans=val1*val2;
                }
                else if(s.equals("/")){
                    ans=val2/val1;
                }
                stack.push(ans);
            }
        }
        return stack.pop();

    }
}
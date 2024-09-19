class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            if(!stack1.isEmpty() && ch1=='#') stack1.pop();
            else{
                if(ch1!='#'){
                    stack1.push(ch1);
                }
            }
        }
        for(int i=0;i<t.length();i++){
            char ch2=t.charAt(i);
            if(!stack2.isEmpty() && ch2=='#') stack2.pop();
            else{
                if(ch2!='#'){
                    stack2.push(ch2);
                }
            }
        }
        return stack1.equals(stack2);
    }
}
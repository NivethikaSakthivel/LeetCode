class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int ast:asteroids){
            boolean destroyed=false;
            while(!stack.isEmpty() && ast<0 && stack.peek()>0){
                if(Math.abs(stack.peek())<Math.abs(ast)){
                    stack.pop();
                    continue;
                }
                else if(Math.abs(stack.peek())==Math.abs(ast)){
                    stack.pop();
                }
                destroyed=true;
                break;
            }
            if(!destroyed) stack.push(ast);
        }        
        int[] res=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            res[i]=stack.pop();
        }
        return res;
    }
}
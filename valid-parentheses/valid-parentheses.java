class Solution {
      public boolean isValid(String s) {
      Stack<Character> stack = new Stack<Character>();

        for(int i = 0 ; i<s.length(); i++){
            char ch = s.charAt(i);

            switch(ch){
                case '(': stack.push(')');
                    break;
                case '{': stack.push('}');
                    break;
                case '[': stack.push(']');
                    break;
                default : if(stack.isEmpty() || stack.pop()!=ch) return false;
            }
        }
        return stack.isEmpty();
    }
    
}
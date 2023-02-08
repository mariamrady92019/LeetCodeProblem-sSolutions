class Solution {
   
     public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int res = 0;
        for (int i = 0; i < tokens.length; i++) {
            res=0;
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {

                int num2 = stack.pop();
                int num1 = stack.pop();
                switch (tokens[i]) {
                    case "+":
                        res = num1 + num2;
                        break;
                    case "-":
                        // code block
                        res = num1 - num2;
                        break;

                    case "*":
                        // code block
                        res = num1 * num2;
                        break;

                    case "/":
                        // code block
                        if (num2 != 0) {
                            res = num1 / num2;
                        }
                        break;

                }
                stack.push(res);

            } else {
                res=Integer.valueOf(tokens[i]);
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
         return  res;
    }
}
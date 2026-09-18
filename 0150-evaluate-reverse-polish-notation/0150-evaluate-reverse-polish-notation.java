class Solution {
    public int evalRPN(String[] t) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<t.length;i++) {
            String s = t[i];

            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();

                if(s.equals("+")) {
                    stack.push(a+b);
                }

                else if(s.equals("-")) {
                    stack.push(a-b);
                }

                else if(s.equals("*")) {
                    stack.push(a*b);
                }

                else {
                    stack.push(a/b);
                }
            }

            else {
                stack.push(Integer.parseInt(s));
            }
           
     }
     return stack.pop();
}
}
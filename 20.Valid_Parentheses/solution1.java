class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case '(': case '[': case '{': stack.push(s.charAt(i));
                    break;
                case ')': 
                    if(!stack.empty() && stack.peek() == '('){
                        stack.pop();
                        break;
                    }
                    else
                        return false;
                case ']': 
                    if(!stack.empty() && stack.peek() == '['){
                        stack.pop();
                        break;
                    }
                    else
                        return false;
                case '}': 
                    if(!stack.empty() && stack.peek() == '{'){
                        stack.pop();
                        break;
                    }
                    else
                        return false;             
            }
        }
        return(stack.empty());
    }
}

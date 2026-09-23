class Solution {
    public boolean isValid(String s) {

        if (s.length() % 2 != 0)
            return false;

        char[] stack = new char[s.length()];
        int top = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                stack[top++] = ')';
            }else if(c == '{'){
                stack[top++]='}';
            }else if(c == '['){
                stack[top++]= ']';
            }
            else {
                if (top == 0 ||  c != stack[--top]){
                    return false;
                }
            }
        }

        return top == 0;
    }
}
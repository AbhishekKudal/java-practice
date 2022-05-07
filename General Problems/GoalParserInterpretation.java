/*
1678. Goal Parser Interpretation

https://leetcode.com/problems/goal-parser-interpretation/
*/

class Solution1 {
    public String interpret(String command) {
        
        StringBuilder st = new StringBuilder();
        
        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == 'G'){
                st.append('G');
            }
            if(i < command.length() - 1 && command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                st.append('o');
            }
            if(i < command.length() - 1 && command.charAt(i) == '(' && command.charAt(i+1) == 'a'){
                st.append("al");
            }            
        }
        return st.toString();
    }
}

class Solution2 {
    public String interpret(String command) {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<command.length();i++){
            char c=command.charAt(i);
            if(c=='G'){
                sb.append('G');
            }else if(c=='('){
                char next=command.charAt(i+1);
                if(next==')'){
                    sb.append('o');
                }else{
                    sb.append("al");
                }
            }
        }
        return sb.toString();
          
    }
}

class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> ds = new Stack<>();
        for(int i=0;i<n;i++){
            char val = s.charAt(i);
            if(val =='{' || val =='['|| val =='('){
                ds.push(val);
            }else{
                if(ds.isEmpty()) return false;
                char curr = ds.peek();
                if((val =='}' && curr=='{')||
                (val ==']' && curr=='[')||
                (val ==')' && curr=='(')){
                    ds.pop();
                }else{
                    return false;
                }
            }
        }
        if(!ds.isEmpty()) return false;
        return true;
    }
}

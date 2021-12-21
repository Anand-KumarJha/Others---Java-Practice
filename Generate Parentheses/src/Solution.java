import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backTrack(ans,"",0,0,n);
        return ans;
    }

    public void backTrack(List<String> ans, String s, int open, int close, int max){
        if(s.length() == max * 2){
            ans.add(s);
            return;
        }

        if(open < max){
            backTrack(ans,s+"(",open+1,close,max);
        }
        if(close < open){
            backTrack(ans,s+")",open,close+1,max);
        }
    }
}
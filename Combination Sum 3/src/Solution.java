import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        LinkedList<Integer> list1 = new LinkedList<>();

        backTrack(k,n,0,list,list1);
        return list;
    }

    public void backTrack(int k, int remain, int start, List<List<Integer>> list, LinkedList<Integer> linkedList){

        if(remain == 0 &&  linkedList.size() == k){
            list.add(new ArrayList(linkedList));
            return;
        }

        if(remain < 0 && linkedList.size() == k){
            return;
        }

        for(int i = start; i < 9; i++){
            linkedList.add(i + 1);
            backTrack(k,remain - (i + 1),i+1,list,linkedList);
            linkedList.removeLast();
        }
    }
}
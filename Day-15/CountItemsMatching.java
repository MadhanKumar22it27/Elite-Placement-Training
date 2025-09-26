import java.util.*;
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        if(ruleKey.equals("type")){
            return count(items,ruleValue,0);
        }else if(ruleKey.equals("color")){
            return count(items,ruleValue,1);
        }else{
            return count(items,ruleValue,2);
        }
    }
    static int count(List<List<String>> items,String ruleValue,int col){
        String str ;
        int sum = 0;
        for(int i=0 ; i<items.size() ; i++){
            str = items.get(i).get(col) ;
            if(ruleValue.equals(str)) sum++;
        }
        return sum;
    }
}
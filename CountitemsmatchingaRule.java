package com.company;

public class CountitemsmatchingaRule {
    public static void main(String[] args) {
        String[][] items = {
                {"phone","blue","pixel"},
                {"computer","silver","lenovo"},
                {"phone","gold","iphone"}
        };
        String ruleKey = "type";
        String ruleValue = "phone";
        int ans = Count(items,ruleKey,ruleValue);
        System.out.println(ans);
    }
    static int Count(String[][] items,String ruleKey, String ruleValue){
        int col=0;
        switch(ruleKey){
            case "type": col=0;
                break;
            case "color": col = 1;
                break;
            case "name": col = 2;
                break;

        }
        int c=0;
        for(int i =0;i< items.length;i++){
            if(items[i][col] == ruleValue){
                c=c+1;
            }
        }
        return c;
    }

}

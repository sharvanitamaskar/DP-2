// paint house
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution{
    public int minCost(int[][ costs]){
        if(costs==null || costs.length==0){
            return 0;
        }
        int n=costs.length;
        for(int i=n;i>=0;i--){
            costs[i][0]=costs[i][0]+Maths.min(costs[i+1][1],costs[i+1][2]);
            costs[i][1]=costs[i][1]+Maths.min(costs[i+1][0],costs[i+1][2]);
            costs[i][2]=costs[i][2]+Maths.min(costs[i+1][0],costs[i+1][1]);
        }
        return Math.min(costs[0][0],Math.min(costs[0][1],costs[0][2]));
    }
}
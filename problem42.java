class Solution {
    public int trap(int[] height) {
        int totalwater=0;
        int water=0;
        int leftmax[] = new int[height.length];
        int rightmax[] = new int[height.length];
          leftmax[0]=height[0];
          rightmax[rightmax.length-1]=height[height.length-1];

          for(int i=1;i<leftmax.length;i++){
            if(height[i]>leftmax[i-1]){
                leftmax[i]=height[i];
            }else{
                leftmax[i]=leftmax[i-1];
            }
          }
          for(int j=height.length-2;j>=0;j--){
            if(height[j]>rightmax[j+1]){
                rightmax[j]=height[j];
            }else{
                rightmax[j]=rightmax[j+1];
            }
          }

          for(int i=0;i<height.length;i++){
            int watertrap = Math.min(rightmax[i],leftmax[i]);
                 water = watertrap-height[i];
                 totalwater += water;
          }


            return totalwater;
    }
}

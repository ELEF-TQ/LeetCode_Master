class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int P1 = m - 1 ; //nums1
        int P2 = n - 1 ; //nums2
        int P = m + n - 1 ; // merged array
       

        // merge in reverse ordre
        while(P1 >= 0 && P2 >= 0) {
            if(nums1[P1] > nums2[P2]){
                nums1[P] = nums1[P1];
                P1--;
            } else {
                nums1[P] = nums2[P2];
                P2--;       
            }

            P--;
        }
        
        //rest of nums2
        while(P2 >=0 ){
            nums1[P] = nums2[P2];
            P2--;
            P--;
        }
      
    }
}

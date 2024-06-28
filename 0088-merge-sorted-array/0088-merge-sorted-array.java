


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            int []arr=new int[m];
            for(int i=0;i<m;i++)
            {
                arr[i]=nums1[i];
            }
            int p1=0,p2=0,c=0;
            while(p1<m&&p2<n)
            {
                 if(arr[p1]<=nums2[p2])
                 {
                     nums1[c++]=arr[p1++];
                 } 
                 else  {
                     nums1[c++]=nums2[p2++];
                 }
            }
            while(p1<m)
            {
                nums1[c++]=arr[p1++];
            }
            while (p2<n)
            {
                nums1[c++]=nums2[p2++];
            }
          
    }
}
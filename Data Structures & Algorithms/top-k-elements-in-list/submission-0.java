class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        // Manually loop and add elements
        for (int num : nums) {
            set.add(num); // Autoboxes 'int' to 'Integer' automatically
        }        // Convert back to an array if needed
        int[] unique = new int[set.size()];
int i = 0;
for (Integer num : set) {
    unique[i++] = num; // Java automatically unboxes Integer to int
}
        int[] freq=count(nums,unique);
        int n=freq.length;
        for(i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(freq[j+1]<freq[j])
                {
                    int temp=freq[j+1];
                    freq[j+1]=freq[j];
                    freq[j]=temp;
                    temp=unique[j+1];
                    unique[j+1]=unique[j];
                    unique[j]=temp;
                }
            }
        }
        int fin[]=new int[k];
        int ctr=n-k;
        for(int j=0;j<k;j++)
        {
            fin[j]=unique[ctr++];
        }
        return fin;
    }
    public int[] count(int[] nums, int[] unique)
    {
        int ctr=0;
        int freq[]=new int[unique.length];
        for(int i=0;i<unique.length;i++)
        {
            ctr=0;
            for (int j=0;j<nums.length;j++)
            {
                if(unique[i]==nums[j])
                {
                    ctr++;
                }
            }
            freq[i]=ctr;
        }
        return freq;
    }
}

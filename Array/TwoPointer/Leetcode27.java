class Leetcode27 { 
    public int removeElement(int[] nums, int val) {
        int left = 0;

        for(int right = 0; right < nums.length; right++) {

            if(nums[right] != val) {

                // yaha pe like agar eg 2!=3 then kya karna hai ki jo element right pe h vo left pe hoga isliye krre hai and left will move by 1

                nums[left] = nums[right];
                left++;
            }
        }

        return left;
    }

        
    
}


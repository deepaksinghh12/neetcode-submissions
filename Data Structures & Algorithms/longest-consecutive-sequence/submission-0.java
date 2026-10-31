class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Step 1: Insert all elements into HashSet
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Check every number
        for (int num : set) {

            // Step 3: Start counting only if previous number is absent
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                // Step 4: Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                // Step 5: Update maximum length
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}

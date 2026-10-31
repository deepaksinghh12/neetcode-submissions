class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency using HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Get all unique numbers
        List<Integer> list = new ArrayList<>(map.keySet());

        // Step 3: Sort by frequency (highest first)
        list.sort((a, b) -> map.get(b) - map.get(a));

        // Step 4: Store the first k elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}

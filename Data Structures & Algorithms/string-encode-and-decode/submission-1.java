public class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();

        for (String str : strs) {
            result.append(str.length())
                  .append("#")
                  .append(str);
        }

        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            // Find the delimiter
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            // Extract the length
            int length = Integer.parseInt(str.substring(i, j));

            // Extract the actual string
            String word = str.substring(j + 1, j + 1 + length);

            result.add(word);

            // Move to the next encoded string
            i = j + 1 + length;
        }

        return result;
    }
}

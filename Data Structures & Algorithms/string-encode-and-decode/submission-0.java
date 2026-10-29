

class Solution {

    public String encode(List<String> strs) {
            StringBuilder encoded = new StringBuilder();

                    for (String s : strs) {
                                encoded.append(s.length())
                                                   .append('#')
                                                                      .append(s);
                                                                              }

                                                                                      return encoded.toString();
                                                                                          }

                                                                                              public List<String> decode(String s) {
                                                                                                      List<String> result = new ArrayList<>();
                                                                                                              int i = 0;

                                                                                                                      while (i < s.length()) {
                                                                                                                                  int j = i;

                                                                                                                                              // Find the separator after the length
                                                                                                                                                          while (s.charAt(j) != '#') {
                                                                                                                                                                          j++;
                                                                                                                                                                                      }

                                                                                                                                                                                                  // Parse the length
                                                                                                                                                                                                              int length = Integer.parseInt(s.substring(i, j));

                                                                                                                                                                                                                          // Extract exactly that many characters
                                                                                                                                                                                                                                      int start = j + 1;
                                                                                                                                                                                                                                                  int end = start + length;

                                                                                                                                                                                                                                                              result.add(s.substring(start, end));

                                                                                                                                                                                                                                                                          // Move to the next encoded string
                                                                                                                                                                                                                                                                                      i = end;
                                                                                                                                                                                                                                                                                              }

                                                                                                                                                                                                                                                                                                      return result;
                                                                                                                                                                                                                                                                                                          }
                                                                                                                                                                                                                                                                                                          }

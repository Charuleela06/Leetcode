import java.util.*;

class Solution {
    public String makeLargestSpecial(String s) {
            List<String> list = new ArrayList<>();
                    int count = 0, start = 0;

                            for (int i = 0; i < s.length(); i++) {
                                        if (s.charAt(i) == '1') count++;
                                                    else count--;

                                                                // When count == 0 → found a special substring
                                                                            if (count == 0) {
                                                                                            // Recursively process inside part
                                                                                                            String inner = makeLargestSpecial(s.substring(start + 1, i));
                                                                                                                            list.add("1" + inner + "0");
                                                                                                                                            start = i + 1;
                                                                                                                                                        }
                                                                                                                                                                }

                                                                                                                                                                        // Sort in descending order
                                                                                                                                                                                Collections.sort(list, Collections.reverseOrder());

                                                                                                                                                                                        // Join all parts
                                                                                                                                                                                                StringBuilder result = new StringBuilder();
                                                                                                                                                                                                        for (String str : list) {
                                                                                                                                                                                                                    result.append(str);
                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                    return result.toString();
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        }
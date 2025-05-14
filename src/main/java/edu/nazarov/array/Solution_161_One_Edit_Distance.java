package edu.nazarov.array;

public class Solution_161_One_Edit_Distance {
    public boolean isOneEditDistance(String s, String t) {
        int lengthS = s.length();
        int lengthT = t.length();

        if (lengthS < lengthT) {
            return isOneEditDistance(t, s);
        }

        if (lengthS - lengthT > 1) {
            return false;
        }

        for (int i = 0; i < lengthT; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (lengthS == lengthT) {
                    return s.substring(i + 1).equals(t.substring(i + 1));
                }
                return s.substring(i + 1).equals(t.substring(i));
            }
        }

        return lengthS == lengthT + 1;
    }
}

class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {

            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (mapS[sc] != 0 || mapT[tc] != 0) {

                if (mapS[sc] != tc + 1 ||
                    mapT[tc] != sc + 1) {
                    return false;
                }

            } else {
                mapS[sc] = tc + 1;
                mapT[tc] = sc + 1;
            }
        }

        return true;
    }
}
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int cycle = 2 * numRows - 2;

        for (int row = 0; row < numRows; row++) {
            for (int j = row; j < n; j += cycle) {
                sb.append(s.charAt(j));

                int diagonal = j + cycle - 2 * row;
                if (row != 0 && row != numRows - 1 && diagonal < n) {
                    sb.append(s.charAt(diagonal));
                }
            }
        }

        return sb.toString();
    }
}
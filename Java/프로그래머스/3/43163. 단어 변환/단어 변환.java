import java.util.*;

class Solution {

    public int solution(String begin, String target, String[] words) {

        boolean exist = false;
        for (String word : words) {
            if (word.equals(target)) {
                exist = true;
                break;
            }
        }

        if (!exist) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        Queue<Integer> count = new LinkedList<>();
        boolean[] visited = new boolean[words.length];

        queue.offer(begin);
        count.offer(0);

        while (!queue.isEmpty()) {

            String cur = queue.poll();
            int depth = count.poll();

            if (cur.equals(target)) {
                return depth;
            }

            for (int i = 0; i < words.length; i++) {

                if (visited[i]) {
                    continue;
                }

                if (canChange(cur, words[i])) {
                    visited[i] = true;
                    queue.offer(words[i]);
                    count.offer(depth + 1);
                }
            }
        }

        return 0;
    }

    private boolean canChange(String a, String b) {

        int diff = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diff++;
            }
        }

        return diff == 1;
    }
}
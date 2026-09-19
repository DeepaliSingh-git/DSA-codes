class Solution {
    public int openLock(String[] deadends, String target) {

        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        Set<String> visited = new HashSet<>();

        Queue<String> queue = new LinkedList<>();

        // Starting position
        if (dead.contains("0000")) {
            return -1;
        }
        queue.offer("0000");
        visited.add("0000");

        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size-- > 0) {
                String current = queue.poll();
                if (current.equals(target)) {
                    return steps;
                }
                // Generate 8 possible moves
                for (int i = 0; i < 4; i++) {
                    int digit = current.charAt(i) - '0';

                    int nextDigit = (digit + 1) % 10; //forward
                    String next = current.substring(0, i)
                            + nextDigit
                            + current.substring(i + 1);

                    if (!dead.contains(next) && !visited.contains(next)) {
                        visited.add(next);
                        queue.offer(next);
                    }
                    int prevDigit = (digit + 9) % 10; //backward
                    String prev = current.substring(0, i)
                            + prevDigit
                            + current.substring(i + 1);

                    if (!dead.contains(prev) && !visited.contains(prev)) {
                        visited.add(prev);
                        queue.offer(prev);
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}
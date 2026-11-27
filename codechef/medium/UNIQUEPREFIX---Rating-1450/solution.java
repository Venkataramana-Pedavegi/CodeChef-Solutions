import java.io.*;
import java.util.*;

public class Main {

    static class UserResult {
        String name;
        int prefixLength;

        UserResult(String name, int prefixLength) {
            this.name = name;
            this.prefixLength = prefixLength;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        int numberOfUsers = Integer.parseInt(
                reader.readLine().trim()
        );

        List<String> usernames =
                new ArrayList<>(numberOfUsers);

        Map<String, Integer> frequency =
                new HashMap<>();

        for (int i = 0; i < numberOfUsers; i++) {
            String username = reader.readLine().trim();

            usernames.add(username);

            frequency.put(
                    username,
                    frequency.getOrDefault(username, 0) + 1
            );
        }

        /*
         * Store each distinct username in lexicographical order.
         */
        List<String> sortedDistinct =
                new ArrayList<>(frequency.keySet());

        Collections.sort(sortedDistinct);

        Map<String, Integer> prefixLength =
                new HashMap<>();

        /*
         * In a lexicographically sorted list, the username having
         * the maximum common prefix with the current username must
         * be either its previous or next neighbor.
         */
        for (int i = 0; i < sortedDistinct.size(); i++) {
            String current = sortedDistinct.get(i);

            if (frequency.get(current) > 1) {
                prefixLength.put(current, -1);
                continue;
            }

            int maximumLcp = 0;

            if (i > 0) {
                maximumLcp = Math.max(
                        maximumLcp,
                        getLcpLength(
                                current,
                                sortedDistinct.get(i - 1)
                        )
                );
            }

            if (i + 1 < sortedDistinct.size()) {
                maximumLcp = Math.max(
                        maximumLcp,
                        getLcpLength(
                                current,
                                sortedDistinct.get(i + 1)
                        )
                );
            }

            /*
             * The required unique prefix consists of one more
             * character than the maximum common prefix.
             */
            int requiredLength = maximumLcp + 1;

            /*
             * This happens when the current username is a prefix
             * of another distinct username.
             *
             * Example:
             * app
             * apple
             *
             * No prefix of "app" uniquely identifies it.
             */
            if (requiredLength > current.length()) {
                prefixLength.put(current, -1);
            } else {
                prefixLength.put(current, requiredLength);
            }
        }

        List<UserResult> results =
                new ArrayList<>(numberOfUsers);

        for (String username : usernames) {
            results.add(
                    new UserResult(
                            username,
                            prefixLength.get(username)
                    )
            );
        }

        results.sort((first, second) -> {
            boolean firstInvalid =
                    first.prefixLength == -1;

            boolean secondInvalid =
                    second.prefixLength == -1;

            /*
             * Put -1 entries after all valid prefix lengths.
             */
            if (firstInvalid != secondInvalid) {
                return firstInvalid ? 1 : -1;
            }

            /*
             * Follow the sample: larger prefix length first.
             */
            if (first.prefixLength != second.prefixLength) {
                return Integer.compare(
                        second.prefixLength,
                        first.prefixLength
                );
            }

            /*
             * Same prefix length: sort by username.
             */
            return first.name.compareTo(second.name);
        });

        StringBuilder output = new StringBuilder();

        for (UserResult result : results) {
            output.append(result.name)
                  .append(' ')
                  .append(result.prefixLength)
                  .append('\n');
        }

        System.out.print(output);
    }

    private static int getLcpLength(
            String first,
            String second
    ) {
        int commonLength = 0;
        int minimumLength = Math.min(
                first.length(),
                second.length()
        );

        while (commonLength < minimumLength &&
               first.charAt(commonLength) ==
               second.charAt(commonLength)) {

            commonLength++;
        }

        return commonLength;
    }
}
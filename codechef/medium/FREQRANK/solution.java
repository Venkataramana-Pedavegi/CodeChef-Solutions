import java.io.*;
import java.util.*;

public class Main {

    static class Info {
        int value;
        TreeSet<Integer> positions = new TreeSet<>();

        Info(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer =
                new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int queries = Integer.parseInt(tokenizer.nextToken());

        List<Integer> array = new ArrayList<>(n);
        Map<Integer, Info> information = new HashMap<>();

        tokenizer = new StringTokenizer(reader.readLine());

        for (int index = 1; index <= n; index++) {
            int value = Integer.parseInt(tokenizer.nextToken());

            array.add(value);

            information
                    .computeIfAbsent(value, Info::new)
                    .positions
                    .add(index);
        }

        Comparator<Info> rankingComparator = (first, second) -> {
            int comparison =
                    Integer.compare(
                            second.positions.size(),
                            first.positions.size()
                    );

            if (comparison != 0) {
                return comparison;
            }

            comparison =
                    Integer.compare(
                            first.positions.first(),
                            second.positions.first()
                    );

            if (comparison != 0) {
                return comparison;
            }

            return Integer.compare(first.value, second.value);
        };

        TreeSet<Info> ranking =
                new TreeSet<>(rankingComparator);

        ranking.addAll(information.values());

        StringBuilder answer = new StringBuilder();

        for (int query = 0; query < queries; query++) {
            tokenizer = new StringTokenizer(reader.readLine());
            String operation = tokenizer.nextToken();

            if (operation.equals("SET")) {
                int index = Integer.parseInt(tokenizer.nextToken());
                int newValue = Integer.parseInt(tokenizer.nextToken());

                int oldValue = array.get(index - 1);

                if (oldValue == newValue) {
                    continue;
                }

                Info oldInfo = information.get(oldValue);

                ranking.remove(oldInfo);
                oldInfo.positions.remove(index);

                if (oldInfo.positions.isEmpty()) {
                    information.remove(oldValue);
                } else {
                    ranking.add(oldInfo);
                }

                Info newInfo = information.get(newValue);

                if (newInfo == null) {
                    newInfo = new Info(newValue);
                    information.put(newValue, newInfo);
                } else {
                    ranking.remove(newInfo);
                }

                newInfo.positions.add(index);
                ranking.add(newInfo);

                array.set(index - 1, newValue);

            } else if (operation.equals("COUNT")) {
                int value = Integer.parseInt(tokenizer.nextToken());
                Info info = information.get(value);

                answer.append(
                        info == null ? 0 : info.positions.size()
                ).append('\n');

            } else {
                int k = Integer.parseInt(tokenizer.nextToken());
                int printed = 0;

                for (Info info : ranking) {
                    if (printed == k) {
                        break;
                    }

                    if (printed > 0) {
                        answer.append(' ');
                    }

                    answer.append(info.value);
                    printed++;
                }

                if (printed == 0) {
                    answer.append("EMPTY");
                }

                answer.append('\n');
            }
        }

        System.out.print(answer);
    }
}
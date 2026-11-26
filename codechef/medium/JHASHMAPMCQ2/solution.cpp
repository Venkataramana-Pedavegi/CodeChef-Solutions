import java.io.*;
import java.util.*;

public class Main {

    static class Section {
        Properties properties;
        LinkedHashSet<String> localOrder =
                new LinkedHashSet<>();

        Section(Properties parent) {
            if (parent == null) {
                properties = new Properties();
            } else {
                properties = new Properties(parent);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        int queries =
                Integer.parseInt(reader.readLine().trim());

        Map<String, Section> sections = new HashMap<>();
        sections.put("ROOT", new Section(null));

        StringBuilder answer = new StringBuilder();

        for (int query = 0; query < queries; query++) {
            StringTokenizer tokenizer =
                    new StringTokenizer(reader.readLine());

            String operation = tokenizer.nextToken();

            if (operation.equals("CREATE")) {
                String childName = tokenizer.nextToken();
                String parentName = tokenizer.nextToken();

                Section parent = sections.get(parentName);

                sections.put(
                        childName,
                        new Section(parent.properties)
                );

            } else if (operation.equals("SET")) {
                String sectionName = tokenizer.nextToken();
                String key = tokenizer.nextToken();
                String value = tokenizer.nextToken();

                Section section = sections.get(sectionName);

                /*
                 * containsKey checks only properties stored locally
                 * in this Properties object. It does not search defaults.
                 */
                if (!section.properties.containsKey(key)) {
                    section.localOrder.add(key);
                }

                section.properties.setProperty(key, value);

            } else if (operation.equals("UNSET")) {
                String sectionName = tokenizer.nextToken();
                String key = tokenizer.nextToken();

                Section section = sections.get(sectionName);

                section.properties.remove(key);
                section.localOrder.remove(key);

            } else if (operation.equals("GET")) {
                String sectionName = tokenizer.nextToken();
                String key = tokenizer.nextToken();

                String value = sections
                        .get(sectionName)
                        .properties
                        .getProperty(key);

                answer.append(
                        value == null ? "NOT_FOUND" : value
                ).append('\n');

            } else if (operation.equals("LIST")) {
                String sectionName = tokenizer.nextToken();
                Section section = sections.get(sectionName);

                SortedSet<String> keys =
                        new TreeSet<>(
                                section.properties
                                       .stringPropertyNames()
                        );

                if (keys.isEmpty()) {
                    answer.append("EMPTY\n");
                } else {
                    int printed = 0;

                    for (String key : keys) {
                        if (printed > 0) {
                            answer.append(' ');
                        }

                        answer.append(key)
                              .append('=')
                              .append(
                                      section.properties
                                             .getProperty(key)
                              );

                        printed++;
                    }

                    answer.append('\n');
                }

            } else {
                String sectionName = tokenizer.nextToken();
                Section section = sections.get(sectionName);

                if (section.localOrder.isEmpty()) {
                    answer.append("EMPTY\n");
                } else {
                    Iterator<String> iterator =
                            section.localOrder.iterator();

                    int printed = 0;

                    while (iterator.hasNext()) {
                        String key = iterator.next();

                        if (printed > 0) {
                            answer.append(' ');
                        }

                        answer.append(key)
                              .append('=')
                              .append(
                                      section.properties
                                             .getProperty(key)
                              );

                        printed++;
                    }

                    answer.append('\n');
                }
            }
        }

        System.out.print(answer);
    }
}
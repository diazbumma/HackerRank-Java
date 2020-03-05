package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while(testCases > 0){
            String line = in.nextLine();

            Pattern tagPattern = Pattern.compile("<([^<]+)>[^<>]+</\\1>");
            Matcher matcher = tagPattern.matcher(line);
            List<String> found = new ArrayList<>();

            while (matcher.find()) {
                String content = matcher.group();
                content = content.replaceAll("<[^>]*>", "");
                found.add(content);
            }

            if (!found.isEmpty()) {
                for (String item : found) {
                    System.out.println(item);
                }
            } else {
                System.out.println("None");
            }

            testCases--;
        }
    }
}

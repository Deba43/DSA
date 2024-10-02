package String;

public class GoalParser {
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        String re = interpret(command);
        System.out.println(re);
    }

    public static String interpret(String command) {
        // return command.replace("()","o").replace("(al)","al");
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            if (c != '(' && c != ')') {
                word.append(c);
            } else if (c == ')' && command.charAt(i - 1) == '(') {
                word.append('o');
            }
        }
        return word.toString();
    }

}

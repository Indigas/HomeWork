import java.util.*;

public class Main {


    public static void main(String[] args) {

        String[] str={"xxx(aaa)vv[wwww(x)]{}",
                "xxsssddd","xx((sss)s]ddd","xx[(sss])ddd","xx[(sss]ddd"};

        Arrays.stream(str).forEach(t -> System.out.println(TaskOne.checkParentheses(t)));


    }
}

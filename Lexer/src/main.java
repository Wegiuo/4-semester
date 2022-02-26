import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        System.out.println(x);

        LinkedList<token> list = new LinkedList<>();
        list.addAll(CreatTokens(x));
        for (token t: list) {
            System.out.println(t.type + " " + t.value);
        }
    }
    public static LinkedList<token> CreatTokens(String x){
        lexer lexer = new lexer();
        LinkedList<token> list = new LinkedList<>();
        String a = "";
        char[] chars = x.toCharArray();
        for (int i=0; i < x.length();i++){
            String b = " ";
            a += chars[i];
            if(i<x.length()-1){
                b = a + chars[i+1];
            }

            for(String key: lexer.lexems.keySet()){
                Pattern patern = Pattern.compile(lexer.lexems.get(key));
                Matcher a1 = patern.matcher(a);
                Matcher b1 = patern.matcher(b);
                if (a1.matches() && !b1.matches()){
                    list.add(new token(key, a));
                    a = "";
                }

            }
        }
        return list;
    }
}

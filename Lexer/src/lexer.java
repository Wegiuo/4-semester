import java.util.HashMap;
import java.util.Map;

public class lexer {
    static Map<String, String> lexems = new HashMap<String,String>();
    public lexer() {
        lexems.put("VAR", "[a-z][a-z0-9]*");
        lexems.put("STRING", "\"[0-9a-zA-Z*\\/&s ]*\"|str(\"[0-9a-zA-Z*\\/&s ]*\")");
        lexems.put("INT", "int([1-9][0-9]*)|[1-9][0-9]*|0");
        lexems.put("IF_KW", "if");
        lexems.put("FOR_KW", "for");
        lexems.put("WHILE_KW", "while");
        lexems.put("L_BRACKET", "\\(");
        lexems.put("R_BRACKET", "\\)");
        lexems.put("L_BRACE", "\\{");
        lexems.put("R_BRACE", "}");
        lexems.put("ASSIGN_OP", "=");
        lexems.put("END_LINE", ";");
        lexems.put("SPACE", " ");
    }
}

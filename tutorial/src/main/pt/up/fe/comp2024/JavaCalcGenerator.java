package pt.up.fe.comp2024;
import pt.up.fe.comp.jmm.ast.AJmmVisitor;
import pt.up.fe.comp.jmm.ast.JmmNode;
import java.util.List;
public class JavaCalcGenerator extends AJmmVisitor<String, String> {
    private String className;

    public JavaCalcGenerator(String className) {
        this.className = className;
    }

    protected void buildVisitor(){
        addVisit("Program", this::dealWithProgram);
        addVisit("Assignment", this::dealWithAssignment);
        addVisit("Integer", this::dealWithLiteral);
        addVisit("Identifier", this::dealWithLiteral);
        addVisit("ExprStmt", this::dealWithExprStmt);
        addVisit("BinaryOp", this::dealWithOperation);
        addVisit("Precedent", this::dealWithPrecedent);
    }

    private String dealWithProgram(JmmNode jmmNode, String s){
        s = (s!=null?s:"");
        String ret = s + "public class "+this.className+" {\n";
        String s2 = s+"\t";
        ret += s2+"public static void main(String[] args) {\n";

        for (JmmNode child : jmmNode.getChildren()) {
            ret += visit(child, s2 + "\t");
            ret += "\n";
        }
        ret += s2 + "}\n";
        ret += s + "}\n";
        return ret;
    }

    private String dealWithAssignment(JmmNode jmmNode, String s){
        String ret = s + "int " + jmmNode.get("var") + " = ";
        ret += visit(jmmNode.getChildren().get(0), "");
        return ret + ";";
    }

    private String dealWithLiteral (JmmNode jmmNode, String s){
        return jmmNode.get("value");
    }

    private String dealWithExprStmt (JmmNode jmmNode, String s){
       String ret = s + "System.out.println('";
       ret += visit(jmmNode.getChildren().get(0), "");
       return ret + "');";
    }

    private String dealWithOperation (JmmNode jmmNode, String s){
        List<JmmNode> children = jmmNode.getChildren();
        String s1 = s + visit(children.get(0), s) + jmmNode.get("op");
        String ret = s1 + visit(children.get(1), "");
        return ret;
    }

    private String dealWithPrecedent (JmmNode jmmNode, String s){
        return s + "(" + visit(jmmNode.getChildren().get(0), "") + ")";
    }
}

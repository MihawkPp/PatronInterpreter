package nonTerminalExpression;

import abstractExpression.Expression;
import Context.ContextContraseña;

/**
 * Esta clase se encarga de combinar diferentes expressiones mediante
 * operaciones logicas como pedia el enunciado del taller (punto 2)
 */
public class AndExpression implements Expression {
    private Expression expr1;
    private Expression expr2;
    private Expression expr3;

    public AndExpression(Expression expr1, Expression expr2, Expression expr3) {
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.expr3 = expr3;
    }

    @Override
    public boolean interprete(ContextContraseña context) {
        return expr1.interprete(context) && expr2.interprete(context) && expr3.interprete(context);
    }

    @Override
    public String getDescripcion() {
        return "(" + expr1.getDescripcion() + " Y " + expr2.getDescripcion() + " Y " + expr3.getDescripcion() + ")";
    }
}

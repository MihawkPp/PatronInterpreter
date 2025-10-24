package terminalExpression;

import abstractExpression.Expression;
import Context.ContextContraseña;

/**
 * Esta clases se encarga de validar que una contraseña contenga al menos 1
 * numero en ella
 */
public class ContenerNumeros implements Expression {

    @Override
    public boolean interprete(ContextContraseña context) {
        String contraseña = context.getContraseña();
        for (char c : contraseña.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getDescripcion() {
        return "Contener al menos un número";
    }

}

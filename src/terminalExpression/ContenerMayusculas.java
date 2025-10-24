package terminalExpression;

import abstractExpression.Expression;
import Context.ContextContraseña;

/**
 * Esta clases se encarga de validar que una contraseña contenga al menos 1
 * letra mayuscula en ella
 */
public class ContenerMayusculas implements Expression {

    @Override
    public boolean interprete(ContextContraseña context) {
        String contraseña = context.getContraseña();
        for (char c : contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getDescripcion() {
        return "Contener al menos una letra mayúscula";
    }

}

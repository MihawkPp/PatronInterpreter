package terminalExpression;

import Context.ContextContraseña;
import abstractExpression.Expression;

/**
 * Esta clase se encarga de validar que una contraseña sea lo suficientemente
 * larga (8 caracteres minimo)
 */
public class MinLongitud implements Expression {

    private int minLongitud;

    public MinLongitud(int minLongitud) {
        this.minLongitud = minLongitud;
    }

    @Override
    public boolean interprete(ContextContraseña context) {
        return context.getContraseña().length() >= minLongitud;
    }

    @Override
    public String getDescripcion() {
        return "Tener al menos " + minLongitud + " caracteres";
    }

}

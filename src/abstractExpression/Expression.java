package abstractExpression;

import Context.ContextContraseña;

/**
 * Esta es la interfaz encargada de definir metodos que serán usados por las sub
 * expresiones que sean necesarios.
 */
public interface Expression {

    boolean interprete(ContextContraseña context);

    String getDescripcion();

}

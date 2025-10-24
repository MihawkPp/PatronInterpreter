import abstractExpression.Expression;
import Context.ContextContraseña;

/**
 * Esta clase es la encargada de validar las contraseñas proporcionadas por el
 * cliente
 */
public class ValidadorContraseña {
    private Expression reglaValidador;

    public ValidadorContraseña(Expression reglaValidador) {
        this.reglaValidador = reglaValidador;
    }

    public boolean validarContraseña(String contraseña) {
        ContextContraseña context = new ContextContraseña(contraseña);
        return reglaValidador.interprete(context);
    }

    public String getReglaDescripcion() {
        return reglaValidador.getDescripcion();
    }
}

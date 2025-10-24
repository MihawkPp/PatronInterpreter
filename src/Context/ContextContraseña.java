package Context;

/**
 * Esta clase esta manejando la contraseña que ingresa el usuario para
 * validarla.
 */
public class ContextContraseña {

    private String contraseña;

    public ContextContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }
}

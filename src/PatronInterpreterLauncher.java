import abstractExpression.Expression;
import nonTerminalExpression.AndExpression;
import terminalExpression.*;

/**
 * Esta es la clase launcher del patrón Interpreter para la validar una
 * contraseñas con varias reglas.
 * 
 * @author Jose Cucanchon 20241020038
 */
public class PatronInterpreterLauncher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("VALIDADOR DE CONTRASEÑAS\n");

        // Construimos las reglas terminales
        Expression minLongitud = new MinLongitud(8);
        Expression tieneNumeros = new ContenerNumeros();
        Expression tieneMayus = new ContenerMayusculas();

        // Se combinan las reglas usando el operador logico AND (todas deben cumplirse)
        Expression reglaAValidar = new AndExpression(minLongitud, tieneNumeros, tieneMayus);

        // Creamos el validador con la regla anterior
        ValidadorContraseña validador = new ValidadorContraseña(reglaAValidar);

        System.out.println("Regla principal:");
        System.out.println(validador.getReglaDescripcion());
        System.out.println();

        String[] contraseñas = { // los resultados que esperamos:
                "abc123", // Falla: menos de 8 caracteres y sin mayúscula
                "abcdefgh", // Falla: sin número y sin mayúscula
                "Pass1", // Falla: menos de 8 caracteres
                "Abcdefgh1", // Válida: cumple todas las reglas
                "Password123" // Válida: cumple todas las reglas
        };

        for (String contraseña : contraseñas) {
            boolean esValida = validador.validarContraseña(contraseña);
            if (esValida) {
                System.out.println("La contraseña: " + contraseña + " es válida.");
            } else {
                System.out.println("La contraseña: " + contraseña + " es inválida.");
            }
        }
    }

}

public class Main {
    public static String primeraLetraMayuscula(String texto) {
        String resultado = "";
        String palabraActual = "";
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (caracter == ' ' || i == texto.length() - 1) {
                if (palabraActual.length() > 0) {
                    char primeraLetra = Character.toUpperCase(palabraActual.charAt(0));
                    resultado += primeraLetra + palabraActual.substring(1);
                    if (i < texto.length() - 1) {
                        resultado += ' ';
                    }
                    palabraActual = "";
                }
            } else {
                palabraActual += caracter;
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        String textoOriginal = "hola soy ekain y tengo mucho sueño ";
        String textoEnMayus = primeraLetraMayuscula(textoOriginal);
        System.out.println("Texto original: " + textoOriginal);
        System.out.println("Texto con mayusculas: " + textoEnMayus);
    }
}
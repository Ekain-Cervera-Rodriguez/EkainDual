public class Main {
    public static String Cadena(String cadena) {
        StringBuilder cadenaInvertida = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida.append(cadena.charAt(i));
        }
        return cadenaInvertida.toString();
    }
    public static void main(String[] args) {
        String cadenaOriginal = "Hola mundo";
        String cadenaInvertida = Cadena(cadenaOriginal);
        System.out.println("Texto original: " + cadenaOriginal);
        System.out.println("Texto invertido: " + cadenaInvertida);
    }
}
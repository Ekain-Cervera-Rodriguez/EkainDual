public class Main {
    public static void trianguloDePascal(int tamaño) {
        int[][] triangulo = new int[tamaño][];
        for (int i = 0; i < tamaño; i++) {
            triangulo[i] = new int[i + 1];
            triangulo[i][0] = 1;
            triangulo[i][i] = 1;
        }
        for (int i = 2; i < tamaño; i++) {
            for (int j = 1; j < i; j++) {
                triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
            }
        }
        for (int i = 0; i < tamaño; i++) {
            for (int s = 0; s < tamaño - i - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int tamaño = 10;
        trianguloDePascal(tamaño);
    }
}
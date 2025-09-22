public class ArrayRecursivo {
    public static void imprimirArray(double[] array, int index) {
        if (index < array.length) {
            System.out.println("Precio: $" + array[index]);
            imprimirArray(array, index + 1);
        }
    }

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirArray(precios, 0);

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        imprimirArray(precios, 0);
    }
}
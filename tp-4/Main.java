public class Main {
    public static void main(String[] args) {
        //constructor completo
        Empleado e1 = new Empleado(1, "Juan Perez", "Analista", 70000);
        Empleado e2 = new Empleado(2, "Lautaro Burgos", "Desarrollador", 80000);

        // Constructor reducido
        Empleado e3 = new Empleado("Pablo Ruiz", "Tester");
        Empleado e4 = new Empleado("Ana Gonzalez", "Diseñadora");

        // Actualizar salarios
        e1.actualizarSalario(10); // 10%
        e2.actualizarSalario(5000); // 5000 fijo
        e3.actualizarSalario(20); // 20%
        e4.actualizarSalario(3000); // 3000 fijo

        // Mostrar los empleados
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        // Mostrar total de empleados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
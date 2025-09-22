public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        setCalificacion(calificacion);
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCurso() { return curso; }
    public double getCalificacion() { return calificacion; }

    public void setCalificacion(double calificacion) {
        if (calificacion < 0) calificacion = 0;
        if (calificacion > 10) calificacion = 10;
        this.calificacion = calificacion;
    }

    public void subirCalificacion(double puntos) {
        setCalificacion(this.calificacion + puntos);
    }

    public void bajarCalificacion(double puntos) {
        setCalificacion(this.calificacion - puntos);
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido +
                " | Curso: " + curso +
                " | Calificación: " + calificacion);
    }

    public static void main(String[] args) {
        Estudiante e = new Estudiante("Ana", "Pérez", "Programación II", 7.5);
        e.mostrarInfo();
        e.subirCalificacion(1.0);
        e.mostrarInfo();
        e.bajarCalificacion(3.0);
        e.mostrarInfo();
    }
}

/**
 * Clase que gestiona la colección de empleados y proporciona métodos para su manipulación.
 */
class Empleados {
    private Empleado[] lista;

     /**
     * Constructor para inicializar un objeto Empleados con una lista de empleados dada.
     * 
     * @param empleados Arreglo de empleados para inicializar la lista.
     */
    public Empleados(Empleado[] empleados) {
        this.lista = empleados;
    }

    /**
     * Muestra la lista de empleados en la consola.
     */
    public void mostrarEmpleados() {
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }

    /**
     * Aumenta el salario de todos los empleados en un porcentaje dado.
     * 
     * @param porcentaje Porcentaje de aumento de salario.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }
     /**
     * Da de alta un nuevo empleado en la lista.
     * 
     * @param empleado Nuevo empleado a dar de alta.
     */

    public void darDeAltaEmpleado(Empleado empleado) {
        // Buscar un espacio vacío en el arreglo para agregar el nuevo empleado
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null) {
                lista[i] = empleado;
                break;
            }
        }
    }
}
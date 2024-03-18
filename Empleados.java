class Empleados {
    private Empleado[] lista;

    public Empleados(Empleado[] empleados) {
        this.lista = empleados;
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

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
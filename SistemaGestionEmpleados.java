import java.util.Scanner;

public class SistemaGestionEmpleados {

    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Juan", "Desarrollador", 50000);
        empleados[1] = new Empleado("María", "Diseñadora", 45000);
        empleados[2] = new Empleado("Pedro", "Gerente", 60000);

        Empleados gestorEmpleados = new Empleados(empleados);

        Scanner scanner = new Scanner(System.in);
        System.out.print(Textos.PREGUNTA_PORCENTAJE_SALARIO);
        double porcentaje = scanner.nextDouble();

        gestorEmpleados.aumentarSalario(porcentaje);
        
        System.out.println(Textos.LISTA_EMPLEADOS);
        gestorEmpleados.mostrarEmpleados();

        scanner.close();
    }
}

import java.util.Scanner;

public class SistemaPedidosApp {
    public static void main(String[] args) {
        SistemaDePedidos sistema = new SistemaDePedidos();
        Sesion sesion = new Sesion();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Agregar Pedido");
            System.out.println("3. Editar Pedido");
            System.out.println("4. Listar Pedidos");
            System.out.println("5. Eliminar Pedido");
            System.out.println("6. Finalizar Sesión");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (opcion) {
                case 1:
                    System.out.print("Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Password: ");
                    String password = scanner.nextLine();
                    sesion.iniciarSesion(username, password);
                    break;
                case 2:
                    if (sesion.isActivo()) {
                        System.out.print("Remitente: ");
                        String remitente = scanner.nextLine();
                        System.out.print("Tipo de Pedido: ");
                        String tipo = scanner.nextLine();
                        System.out.print("Descripción: ");
                        String descripcion = scanner.nextLine();
                        System.out.print("Fecha de Entrega: ");
                        String fechaEntrega = scanner.nextLine();
                        System.out.print("Fecha de Recolección: ");
                        String fechaRecoleccion = scanner.nextLine();
                        System.out.print("Cantidad: ");
                        int cantidad = scanner.nextInt();
                        System.out.print("Costo: ");
                        double costo = scanner.nextDouble();
                        scanner.nextLine(); // Consume the newline character
                        sistema.agregarPedido(remitente, tipo, descripcion, fechaEntrega, fechaRecoleccion, cantidad,
                                costo);
                    } else {
                        System.out.println("Debe iniciar sesión para agregar pedidos.");
                    }
                    break;
                case 3:
                    if (sesion.isActivo()) {
                        System.out.print("ID del Pedido a editar: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        System.out.print("Remitente: ");
                        String remitente = scanner.nextLine();
                        System.out.print("Tipo de Pedido: ");
                        String tipo = scanner.nextLine();
                        System.out.print("Descripción: ");
                        String descripcion = scanner.nextLine();
                        System.out.print("Fecha de Entrega: ");
                        String fechaEntrega = scanner.nextLine();
                        System.out.print("Fecha de Recolección: ");
                        String fechaRecoleccion = scanner.nextLine();
                        System.out.print("Cantidad: ");
                        int cantidad = scanner.nextInt();
                        System.out.print("Costo: ");
                        double costo = scanner.nextDouble();
                        scanner.nextLine(); // Consume the newline character
                        sistema.editarPedido(id, remitente, tipo, descripcion, fechaEntrega, fechaRecoleccion, cantidad,
                                costo);
                    } else {
                        System.out.println("Debe iniciar sesión para editar pedidos.");
                    }
                    break;
                case 4:
                    sistema.listarPedidos();
                    break;
                case 5:
                    if (sesion.isActivo()) {
                        System.out.print("ID del Pedido a eliminar: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        sistema.eliminarPedido(id);
                    } else {
                        System.out.println("Debe iniciar sesión para eliminar pedidos.");
                    }
                    break;
                case 6:
                    sesion.finalizarSesion();
                    break;
                case 7:
                    scanner.close();
                    System.exit(0);
            }
        }
    }
}

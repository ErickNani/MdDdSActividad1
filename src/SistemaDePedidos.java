import java.util.ArrayList;
import java.util.List;

public class SistemaDePedidos {
    private List<Pedido> pedidos = new ArrayList<>();
    private int idCounter = 1;

    public void agregarPedido(String remitente, String tipo, String descripcion, String fechaEntrega,
            String fechaRecoleccion, int cantidad, double costo) {
        Pedido nuevoPedido = new Pedido(idCounter++, remitente, tipo, descripcion, fechaEntrega, fechaRecoleccion,
                cantidad, costo);
        pedidos.add(nuevoPedido);
        System.out.println("Pedido agregado con éxito!");
    }

    public void editarPedido(int id, String remitente, String tipo, String descripcion, String fechaEntrega,
            String fechaRecoleccion, int cantidad, double costo) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId() == id) {
                pedido = new Pedido(id, remitente, tipo, descripcion, fechaEntrega, fechaRecoleccion, cantidad, costo);
                System.out.println("Pedido editado con éxito!");
                return;
            }
        }
        System.out.println("Pedido no encontrado.");
    }

    public void listarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos para mostrar.");
        } else {
            for (Pedido pedido : pedidos) {
                System.out.println(pedido);
            }
        }
    }

    public void eliminarPedido(int id) {
        pedidos.removeIf(p -> p.getId() == id);
        System.out.println("Pedido eliminado con éxito!");
    }
}

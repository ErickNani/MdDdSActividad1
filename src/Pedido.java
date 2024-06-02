public class Pedido {
    private int id;
    private String remitente;
    private String tipo;
    private String descripcion;
    private String fechaEntrega;
    private String fechaRecoleccion;
    private int cantidad;
    private double costo;

    public Pedido(int id, String remitente, String tipo, String descripcion, String fechaEntrega,
            String fechaRecoleccion, int cantidad, double costo) {
        this.id = id;
        this.remitente = remitente;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
        this.fechaRecoleccion = fechaRecoleccion;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public String getRemitente() {
        return remitente;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public String getFechaRecoleccion() {
        return fechaRecoleccion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Remitente: " + remitente + ", Tipo: " + tipo + ", Descripción: " + descripcion +
                ", Fecha de Entrega: " + fechaEntrega + ", Fecha de Recolección: " + fechaRecoleccion +
                ", Cantidad: " + cantidad + ", Costo: " + costo;
    }
}

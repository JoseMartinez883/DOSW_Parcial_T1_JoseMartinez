package edu.dosw.parcial;

import java.util.ArrayList;
import java.util.List;

public class PedidoBuilder {

    private String numeroPedido;
    private String usuario;
    private TipoEntrega tipoEntrega;
    private String bloque = "a";
    private String salon = "a";
    private final List<Producto> productos = new ArrayList<>();

    public PedidoBuilder() {
    }

    public PedidoBuilder numeroPedido(String numero) {
        this.numeroPedido = numero;
        return this;
    }

    public PedidoBuilder usuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public PedidoBuilder agregarProducto(Producto producto) {
        if (productos.size() >= Pedido.MAX_PRODUCTOS ) {
            System.out.println("No es posible añadir mas productos");
        }
        productos.add(producto);
        return this;
    }

    public PedidoBuilder tipoEntrega(TipoEntrega tipo) {
        this.tipoEntrega = tipo;
        return this;
    }

    public PedidoBuilder bloque(String bloque) {
        this.bloque = bloque;
        return this;
    }

    public PedidoBuilder salon(String salon) {
        this.salon = salon;
        return this;
    }

    public Pedido build() {
        int subtotal = productos.stream().mapToInt(Producto::getPrecio).sum();
        if (subtotal < Pedido.PRECIO_MINIMO) {
            throw new IllegalStateException(
                    "El precio mínimo de un pedido es $" +  Pedido.PRECIO_MINIMO +
                            ". Subtotal actual: $" + subtotal
            );
        }

        return new Pedido(numeroPedido,usuario,productos,tipoEntrega,salon,bloque);
    }
}

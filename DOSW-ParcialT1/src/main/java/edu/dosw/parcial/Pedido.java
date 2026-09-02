package edu.dosw.parcial;

import java.util.List;
import java.util.stream.IntStream;

public class Pedido {
    public static final int MAX_PRODUCTOS    = 5;
    public static final int PRECIO_MINIMO = 3500;

    private final String numeroPedido;
    private final String usuario;
    private final List<Producto> productos;
    private final TipoEntrega tipoEntrega;
    private  String salon;
    private  String bloque;


    public Pedido(String numeroPedido, String usuario, List<Producto> productos, TipoEntrega tipoEntrega, String salon, String bloque) {
        this.numeroPedido = numeroPedido;
        this.usuario = usuario;
        this.productos = productos;
        this.tipoEntrega = tipoEntrega;
        this.salon = salon;
        this.bloque = bloque;
    }


    public int calcularSubtotalProductos() {
        return productos.stream()
                .mapToInt(Producto::getPrecio)
                .sum();
    }

    public int calcularTotal() {
        return calcularSubtotalProductos() + tipoEntrega.getCosto();
    }

    public void mostrarResumen() {
        System.out.println("PEDIDO #" + numeroPedido);
        System.out.println("Usuario: " + usuario);
        System.out.println("Número de Productos: " + productos.size());
        System.out.println();

        System.out.println("Descripción del Pedido:");
        IntStream.range(0, productos.size()).forEach(i -> {
            Producto p = productos.get(i);
            System.out.println("  Producto #" + (i + 1) + ": " + p.getDescripcion());
        });

        if (tipoEntrega == TipoEntrega.ENTREGA_SALON) {
            System.out.println("  Entrega Salon: " + bloque + "-" + salon);
        } else {
            System.out.println("  " + tipoEntrega.getDescripcion());
        }

        System.out.println();

        System.out.println("Desglose:");
        if (productos.size() == 1) {
            System.out.println(productos.get(0).getDesglose());
        } else {
            IntStream.range(0, productos.size()).forEach(i -> {
                Producto p = productos.get(i);
                System.out.println("  Desglose #" + (i + 1) + ": " + p.getDesglose());
                System.out.printf("  Subtotal: $%,d%n", p.getPrecio());
            });
        }
        if (tipoEntrega.getCosto() > 0) {
            System.out.printf("+$%,d (entrega)%n", tipoEntrega.getCosto());
        }

        System.out.printf("%nTOTAL: $%,d%n", calcularTotal());
        System.out.println("Estado: CONFIRMADO");
    }

}



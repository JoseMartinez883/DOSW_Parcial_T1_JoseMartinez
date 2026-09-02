package edu.dosw.parcial;

public class Main {
    public static void main(String[] args) {
        System.out.println("═".repeat(50));
        System.out.println("   UNIVERSITY FOOD HUB — Simulación de Pedidos");
        System.out.println("═".repeat(50));
        System.out.println();
        escenario1();
        escenario2();
        escenario3();
    }

    private static void escenario1() {
        Producto bandeja = new ExtraAguacate(
                new ExtraProteina(
                        ProductoBase.bandejaUniversitaria()
                )
        );

        Pedido pedido = new PedidoBuilder()
                .numeroPedido("001")
                .usuario("juan.perez@eci.edu.co")
                .agregarProducto(bandeja)
                .tipoEntrega(TipoEntrega.PARA_LLEVAR)
                .build();
        pedido.mostrarResumen();
    }

    private static void escenario2() {
        Producto sandwich = new ExtraQueso(
                new ExtraPanIntegral(
                        ProductoBase.sandwich()
                )
        );

        Producto jugo = ProductoBase.jugoNatural();
        Pedido pedido =  new PedidoBuilder()
                .numeroPedido("002")
                .usuario("juan.perez@eci.edu.co")
                .agregarProducto(sandwich)
                .agregarProducto(jugo)
                .tipoEntrega(TipoEntrega.CONSUMO_LOCAL)
                .build();
        pedido.mostrarResumen();
    }

    private static void escenario3() {
        Producto ensalada = new ExtraAguacate(
                new ExtraProteina(
                        ProductoBase.ensalada()
                )
        );

        Pedido pedido =  new PedidoBuilder()
                .numeroPedido("003")
                .usuario("juan.perez@eci.edu.co")
                .agregarProducto(ensalada)
                .tipoEntrega(TipoEntrega.ENTREGA_SALON)
                .bloque("A")
                .salon("A-201")
                .build();
        pedido.mostrarResumen();
    }
}


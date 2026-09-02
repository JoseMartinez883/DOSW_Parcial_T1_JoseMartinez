package edu.dosw.parcial;


public class ExtraBebida extends ExtraDecorator {
    private static final int PRECIO = 2000;
    private static final String NOMBRE = "Bebida adicional";

    public ExtraBebida(Producto producto) {
        super(producto);
    }

    @Override
    public String getDescripcion() {
        return productoEnvuelto.getDescripcion() + " + " + NOMBRE;
    }

    @Override
    public int getPrecio() {
        return productoEnvuelto.getPrecio() + PRECIO;
    }

    @Override
    public String getDesglose() {
        return productoEnvuelto.getDesglose()
                + String.format("%n+$%,d (bebida adicional)", PRECIO);
    }
}

package edu.dosw.parcial;

public class ExtraQueso extends ExtraDecorator {
    private static final int PRECIO = 800;
    private static final String NOMBRE = "Queso";

    public ExtraQueso(Producto producto) {
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
                + String.format("%n+$%,d (queso)", PRECIO);
    }
}

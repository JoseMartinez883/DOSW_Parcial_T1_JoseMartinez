package edu.dosw.parcial;

public class ExtraPanIntegral extends ExtraDecorator {
    private static final int PRECIO = 500;
    private static final String NOMBRE = "Pan Integral";

    public ExtraPanIntegral(Producto producto) {
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
                + String.format("%n+$%,d (pan integral)", PRECIO);
    }
}

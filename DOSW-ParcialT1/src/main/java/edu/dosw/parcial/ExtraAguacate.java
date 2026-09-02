package edu.dosw.parcial;

public class ExtraAguacate extends ExtraDecorator {
    private static final int PRECIO = 1500;
    private static final String NOMBRE = "Aguacate";

    public ExtraAguacate(Producto producto) {
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
                + String.format("%n+$%,d (aguacate)", PRECIO);
    }
}

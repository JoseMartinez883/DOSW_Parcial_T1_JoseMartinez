package edu.dosw.parcial;

public class ExtraProteina extends ExtraDecorator {
    private static final int PRECIO = 2000;
    private static final String NOMBRE = "Proteína extra";

    public ExtraProteina(Producto producto) {
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
                + String.format("%n+$%,d (%s)", PRECIO, NOMBRE.toLowerCase());
    }
}

package edu.dosw.parcial;

public abstract class ExtraDecorator implements Producto {

    protected final Producto productoEnvuelto;

    public ExtraDecorator(Producto productoEnvuelto) {
        this.productoEnvuelto = productoEnvuelto;
    }

    @Override
    public String getDescripcion() {
        return productoEnvuelto.getDescripcion();
    }

    @Override
    public int getPrecio() {
        return productoEnvuelto.getPrecio();
    }

    @Override
    public String getDesglose() {
        return productoEnvuelto.getDesglose();
    }
}


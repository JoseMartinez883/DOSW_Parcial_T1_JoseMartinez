package edu.dosw.parcial;


public class ProductoBase implements Producto {

    private final String codigo;
    private final String nombre;
    private final int precio;

    public ProductoBase(String codigo, String nombre, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public static ProductoBase bandejaUniversitaria() {
        return new ProductoBase("PROD-001", "Bandeja universitaria", 8500);
    }
    public static ProductoBase sandwich() {
        return new ProductoBase("PROD-002", "Sandwich", 5000);
    }
    public static ProductoBase ensalada() {
        return new ProductoBase("PROD-003", "Ensalada", 4500);
    }
    public static ProductoBase sopaDelDia() {
        return new ProductoBase("PROD-004", "Sopa del día", 3500);
    }
    public static ProductoBase jugoNatural() {
        return new ProductoBase("PROD-005", "Jugo natural", 2500);
    }

    @Override
    public String getDescripcion() { return nombre; }

    @Override
    public int getPrecio() { return precio; }

    @Override
    public String getDesglose() {
        return String.format("$%,d (base)", precio);
    }

    public String getCodigo() { return codigo; }
}


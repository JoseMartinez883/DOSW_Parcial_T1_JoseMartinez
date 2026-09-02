package edu.dosw.parcial;

public enum TipoEntrega {
    CONSUMO_LOCAL("Consumo Local", 0),
    PARA_LLEVAR("Empaque para llevar", 300),
    ENTREGA_SALON("Entrega Salon", 1000);
    private final String descripcion;
    private final int costo;
    TipoEntrega(String descripcion, int costo) {
        this.descripcion = descripcion;
        this.costo = costo;
    }
    public String getDescripcion() { return descripcion; }
    public int getCosto()          { return costo; }
}

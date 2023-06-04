package models;

public class TipoDeSeguro {
    private String tipo; // automoviles, de vida, medicos
    private String subTipos; // vehiculos, motos, pickups, camionetas

    // Encapsulamiento:
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSubTipos() {
        return subTipos;
    }

    public void setSubTipos(String subTipos) {
        this.subTipos = subTipos;
    }

    @Override
    public String toString() {
        return "TipoDeSeguro{" +
                "tipo='" + tipo + '\'' +
                ", subTipos='" + subTipos + '\'' +
                '}';
    }
}

package models;

public class Asegurado {
    // Atributos
    String tipo; // individual o juridica
    String DPI; // identificador
    String NIT; // identificador
    String correoElectronico; // de la persona o empresa

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Asegurado {" +
                "tipo='" + tipo + '\'' +
                ", DPI='" + DPI + '\'' +
                ", NIT='" + NIT + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}

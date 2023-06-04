package models;

import java.util.Calendar;

public class Seguro {
    // Atributos
    private TipoDeSeguro tiposDeSeguros;
    private Calendar vigecia;
    private float sumasAseguradas;
    private Asegurado asegurado;
    private boolean activo; // true, falso

    // habilitar, renovar, desactivar, ajustar, fraccionar
    public void habilitar() {
        this.activo = true;
    }

    public void desactivar() {
        this.activo = false;
    }

    public void renovar() {
        if (this.tiposDeSeguros.getTipo().equals("automoviles")) {
            // le subimos un año a la vigencia
        }
        // le subimos x cantidad a la vigencia
        this.activo = true;
    }

    public TipoDeSeguro getTiposDeSeguros() {
        return tiposDeSeguros;
    }

    public void setTiposDeSeguros(TipoDeSeguro tiposDeSeguros) {
        this.tiposDeSeguros = tiposDeSeguros;
    }

    public Calendar getVigecia() {
        return vigecia;
    }

    public void setVigecia(Calendar vigecia) {
        this.vigecia = vigecia;
    }

    public float getSumasAseguradas() {
        return sumasAseguradas;
    }

    public void setSumasAseguradas(float sumasAseguradas) {
        this.sumasAseguradas = sumasAseguradas;
    }

    public Asegurado getAsegurado() {
        return asegurado;
    }

    public void setAsegurado(Asegurado asegurado) {
        this.asegurado = asegurado;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Informacion de Seguro{" +
                "tiposDeSeguros=" + tiposDeSeguros +
                ", vigecia=" + vigecia +
                ", sumasAseguradas=" + sumasAseguradas +
                ", asegurado=" + asegurado.toString() +
                ", activo=" + activo +
                '}';
    }
}

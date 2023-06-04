package controllers;

import models.TipoDeSeguro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class TipoDeSeguroController {
    private static final String QUERY = "select * from TiposDeSeguro";

    private SQLConnection sqlConnection = new SQLConnection();

    public List<TipoDeSeguro> getTipoDeSeguros() {
        List<TipoDeSeguro> tipoDeSeguros = new ArrayList<>();

        try {
            // Paso 1: iniciamos la conexion
            sqlConnection.connect();

            // Step 2: creamos un query para consultar la informacion
            PreparedStatement preparedStatement = sqlConnection.getConnection().prepareStatement(QUERY);

            // Paso 3: Ejecutar el query
            ResultSet rs = preparedStatement.executeQuery();

            // Paso 4: vamos a revisar cada resultado de fila en fila
            while (rs.next()) {
                TipoDeSeguro tipo = new TipoDeSeguro();
                tipo.setSubTipos(rs.getString("subtipo"));
                tipo.setTipo(rs.getString("tipo"));

                tipoDeSeguros.add(tipo);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return tipoDeSeguros;
    }
}

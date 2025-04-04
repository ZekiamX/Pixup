package org.albertoangelesdoc.pixup.jdbc.impl;

import org.albertoangelesdoc.pixup.jdbc.Conexion;
import org.albertoangelesdoc.pixup.jdbc.EstadoJdbc;
import org.albertoangelesdoc.pixup.model.Estado;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EstadoJdbcImpl extends Conexion<Estado> implements EstadoJdbc {

    @Override
    public List<Estado> findAll() {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        Estado estado = null;
        List<Estado> list = null;
        String sql = "select * from tbl_estado";




        try {
            connection = getConnection();
            if (connection == null){
                return null;
            }
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            if (resultSet == null){
                return null;
            }
            list = new ArrayList<>();
            while (resultSet.next()){
                estado = new Estado();
                estado.setId(resultSet.getInt(1));
                estado.setNombre(resultSet.getString(2));
                list.add(estado);
            }

            resultSet.close();
            statement.close();
            connection.close();
            return list;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return List.of();
    }
    public static void main(String a[]){
        new EstadoJdbcImpl().findAll().stream().forEach(System.out::println);
    }
}

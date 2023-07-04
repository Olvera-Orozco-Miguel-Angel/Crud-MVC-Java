/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_vista_controlador_crud;

import com.formdev.flatlaf.FlatDarculaLaf;
import modelo_vista_controlador_crud.controlador.controladorClima;
import modelo_vista_controlador_crud.modelo.DatabaseController;
import modelo_vista_controlador_crud.modelo.conexionMysql;
import modelo_vista_controlador_crud.vista.ClimaVista;

/**
 *
 * @author Miguel
 */
public class Modelo_Vista_Controlador_CRUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClimaVista vista = new ClimaVista();
        DatabaseController  db = new DatabaseController();
        controladorClima controlador = new controladorClima(vista,db);
        vista.setVisible(true);
    }
    
}

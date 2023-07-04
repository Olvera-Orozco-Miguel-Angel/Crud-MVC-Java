package modelo_vista_controlador_crud.controlador;

import com.formdev.flatlaf.FlatDarculaLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo_vista_controlador_crud.modelo.DatabaseController;
import modelo_vista_controlador_crud.modelo.clima;
import modelo_vista_controlador_crud.vista.ClimaVista;

public class controladorClima implements ActionListener {

    private ClimaVista vista;
    private DatabaseController bd;
    private clima clima;
    
    public controladorClima(ClimaVista vista, DatabaseController bd) {
        this.vista = vista;
        this.bd = bd;
        clima = new clima();
        vista.insertarBoton.addActionListener(this);        
        
    }
    public void iniciar(){
            FlatDarculaLaf.setup();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.insertarBoton) {
            try{
            clima.setPressure(Double.parseDouble(vista.textFieldPresion.getText()));
            clima.setAltitude(Double.parseDouble(vista.textfieldAltitud.getText()));
            clima.setAir_quality(Double.parseDouble(vista.textFieldCalidadAire.getText()));
            
            try {
                if( bd.insertar(clima)){
                    JOptionPane.showMessageDialog(null,"Registro del clima exitoso");
                }
            } catch (SQLException ex) {
                Logger.getLogger(controladorClima.class.getName()).log(Level.SEVERE, null, ex);
            }
            }catch(Exception ex){
                System.out.println("Este es el error"+ex);
            }
          
           /*
        
*/
        }
    }
    
}

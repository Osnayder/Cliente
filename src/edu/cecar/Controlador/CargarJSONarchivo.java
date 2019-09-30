package edu.cecar.Controlador;

import edu.cecar.Modelo.JSONarchivo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/** Clase: CargarJSONArchivo
 * 
 * @version: 0.1
 *  
 * @sincelejo: 20/09/2019
 * 
 * Fecha de Modificación: 
 * 
 * @author: Osnayder Conde Rodriguez
 * 
 * Copyrigth: CECAR
 */
public class CargarJSONarchivo {
    JSONarchivo archivo = new JSONarchivo();
    
    public CargarJSONarchivo(String ruta){
        
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(ruta));
            archivo = (JSONarchivo)ois.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CargarJSONarchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CargarJSONarchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CargarJSONarchivo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(CargarJSONarchivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public JSONarchivo getJSONarchivo(){
        return archivo;
    }
}

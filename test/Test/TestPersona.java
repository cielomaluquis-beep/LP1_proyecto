/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Dao.PersonaDaoImpl;
import Interface.IPersona;
import Model.Persona;
import Model.Usuario;

/**
 *
 * @author cielo
 */
public class TestPersona {
    IPersona dao = new PersonaDaoImpl();
    
    public static void main(String[] args) {
        TestPersona t=new TestPersona();
        t.crear_usuario();
        
        
    }
    public void crear_usuario(){
        Persona p = new Persona();
        p.setNombre("Cielo Sarai");
        p.setEmail("cielomaluquis@gmail");
        p.setDireccion("Los Martires");
        p.setTelefono("123456789");
        
        Usuario u= new Usuario();
        u.setPassword("admin123");
        int result = dao.insertar(p, u);
        
        if (result >0) {
            System.out.println("Usuario" + p.getEmail());
            System.out.println("Rol"+u.getRol());
            
        } else {
            System.out.println("No se realizo el registro");
        }
        
    }
   }

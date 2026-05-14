/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import Model.Producto;
import java.util.List;

/**
 *
 * @author cielo
 */
public interface IProducto {
    public List<Producto>lista();
    public boolean insertar(Producto pro);
    public boolean update(Producto pro);
    public boolean searchBYId(int id );
    public boolean delete( int id);
    public boolean updateStock( int id,int stock);
    
}

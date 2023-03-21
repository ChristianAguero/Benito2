/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.benito.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.benito.entidades.*;
import mx.itson.benito.persistencia.*;

/**
 *
 * @author shiri
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProveedorDAO p = new ProveedorDAO();
        ArticuloDAO a = new ArticuloDAO();
        OrdenCompraDAO o = new OrdenCompraDAO();
        
        List<Proveedor> pr = new ArrayList<>();
        List<Articulo> ar = new ArrayList<>();
        List<OrdenCompra> ob = new ArrayList<>();
       
        pr = p.ObtenerTodos();
        ar = a.ObtenerTodos();
        ob = o.ObtenerTodos();
        
        
        System.out.println("Holi");
        
    }
    
}

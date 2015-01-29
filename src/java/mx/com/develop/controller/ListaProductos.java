/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.develop.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.com.develop.store.model.Color;
import mx.com.develop.store.model.Producto;
import mx.com.develop.store.model.Talla;
import mx.com.develop.store.model.TipoProducto;

/**
 *
 * @author andres
 */
@WebServlet(name = "ListaProductos", urlPatterns = {"/ListaProductos.view"})
public class ListaProductos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Producto> productos = new LinkedList<Producto>( );
        
        productos.add( new Producto(1, Color.ROJO, 167.5, Talla.CHICA, "Playera con estampado de Disney.", TipoProducto.PLAYERA) );
        productos.add( new Producto(2, Color.AZUL, 199.99, Talla.GRANDE, "Pantalón de mezclilla.", TipoProducto.PANTALON) );
        productos.add( new Producto(3, Color.AMARILLO, 200.00, Talla.CHICA, "Camisa tipo chocoroll", TipoProducto.CAMISA) );
        productos.add( new Producto(4, Color.NEGRO, 99.00, Talla.MEDIANA, "Playera sencilla", TipoProducto.PLAYERA) );
        productos.add( new Producto(5, Color.AMARILLO, 99.00, Talla.MEDIANA, "Playera sencilla", TipoProducto.PLAYERA) );
        productos.add( new Producto(6, Color.VERDE, 99.00, Talla.MEDIANA, "Playera sencilla", TipoProducto.PLAYERA) );
        productos.add( new Producto(7, Color.NARANJA, 99.00, Talla.MEDIANA, "Playera sencilla", TipoProducto.PLAYERA) );
        productos.add( new Producto(8, Color.AZUL, 223.50, Talla.GRANDE, "Pantalon para Chotos", TipoProducto.PANTALON) );
        productos.add( new Producto(9, Color.ROJO, 223.50, Talla.CHICA, "Pantalon para Chotos", TipoProducto.PANTALON) );
        
        String user = "Andres Patrida";
        
        request.setAttribute("productos", productos);
        request.setAttribute("user", user);
        RequestDispatcher rd = request.getRequestDispatcher( "lista_productos.jsp" );
        rd.forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

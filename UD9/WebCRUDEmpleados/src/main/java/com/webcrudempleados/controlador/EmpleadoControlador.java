package com.webcrudempleados.controlador;

import com.webcrudempleados.dao.EmpleadoDAO;
import com.webcrudempleados.modelo.Empleado;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author aidan
 */
@WebServlet(name = "EmpleadoControlador", urlPatterns = {"/EmpleadoControlador"})
public class EmpleadoControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
        private EmpleadoDAO empDao=new EmpleadoDAO();
    
    private final String pagListar="/vista/listar.jsp";
    private final String pagNuevo="/vista/nuevo.jsp";
    private final String pagGuardar="/vista/guardar.jsp";
    private final String pagEditar="/vista/editar.jsp";
    private final String pagBorrar="/vista/borrar.jsp";

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
     String accion=request.getParameter("accion");
     
     switch(accion){
         case "listar":
             listar(request,response);
             break;
         case "nuevo":
             nuevo(request,response);
             break;
         case "guardar":
             guardar(request,response);
             break;
         case "borrar":
             borrar(request,response);
             break;
         case "editar":
             editar(request,response);
             break;
         default:
             throw new AssertionError();
     }
    }
protected void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    request.setAttribute("empleados",this.empDao.listarTodos());
    request.getRequestDispatcher(pagListar).forward(request, response);
            
}
protected void nuevo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    request.setAttribute("empleado",new Empleado());
    request.getRequestDispatcher(pagNuevo).forward(request, response);
            
}
protected void guardar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    Empleado emp =new Empleado();
    
    emp.setId(Integer.parseInt(request.getParameter("id")));
    emp.setNombre(request.getParameter("nombre"));
    emp.setApellidos(request.getParameter("apellidos"));
    emp.setFechaIngreso(request.getParameter("fechaIngreso"));
    emp.setSueldo(Double.parseDouble(request.getParameter("sueldo")));
    emp.setNombreDepto(request.getParameter("nombreDepto"));
    
    int result=0;
    if(emp.getId()==0){
        empDao.insertar(emp);
    }else{
        empDao.editar(emp);
    }
    
    response.sendRedirect("EmpleadoControlador?accion=listar");
            
}
protected void borrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    int id=Integer.parseInt(request.getParameter("id"));
//    Empleado emp= empDao.buscarPorId(id);
//    if(emp!=null){
//        request.setAttribute("empleado",emp);
//        request.getRequestDispatcher(pagBorrar).forward(request, response);
//    }
int result=empDao.borrarPorId(id);
response.sendRedirect("EmpleadoControlador?accion=listar");
    
    
}
protected void editar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    int id=Integer.parseInt(request.getParameter("id"));
   Empleado emp= empDao.buscarPorId(id);

   if(emp!=null){
       request.setAttribute("empleado",emp);
        request.getRequestDispatcher(pagNuevo).forward(request, response);
   }else{
       response.sendRedirect("EmpleadoControlador?accion=listar");
   }
        


    
    
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

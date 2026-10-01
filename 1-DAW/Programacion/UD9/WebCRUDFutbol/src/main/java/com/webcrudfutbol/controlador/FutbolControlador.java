package com.webcrudfutbol.controlador;

import com.webcrudfutbol.dao.FutbolDAO;
import com.webcrudfutbol.modelo.Equipo;
import com.webcrudfutbol.modelo.Futbolista;
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
@WebServlet(name = "FutbolControlador", urlPatterns = {"/FutbolControlador"})
public class FutbolControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
        private FutbolDAO futDao=new FutbolDAO();
    
    private final String pagListarFutbolistas="/vista/listarFutbolistas.jsp";
    private final String pagNuevoFutbolista="/vista/nuevoFutbolista.jsp";
    private final String pagListarEquipos="/vista/listarEquipos.jsp";
    private final String pagNuevoEquipo="/vista/nuevoEquipo.jsp";
    private final String pagListarEmpresa="/vista/listarEmpresa.jsp";

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
     String accion=request.getParameter("accion");
     
     switch(accion){
         case "listarFutbolistas":
             listarFutbolistas(request,response);
             break;
         case "nuevoFutbolista":
             nuevoFutbolista(request,response);
             break;
         case "guardarFutbolista":
             guardarFutbolista(request,response);
             break;
         case "borrarFutbolista":
             borrarFutbolista(request,response);
             break;
         case "editarFutbolista":
             editarFutbolista(request,response);
             break;
         case "listarEquipos":
             listarEquipos(request,response);
             break;
         case "nuevoEquipo":
             nuevoEquipo(request,response);
             break;
         case "guardarEquipo":
             guardarEquipo(request,response);
             break;
         case "borrarEquipo":
             borrarEquipo(request,response);
             break;
         case "editarEquipo":
             editarEquipo(request,response);
             break;
         case "listarEmpresa":
             listarEmpresa(request,response);
             break;
         default:
             throw new AssertionError();
     }
    }

protected void listarFutbolistas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    request.setAttribute("futbolistas",this.futDao.listarTodosFutbolistas());
    request.getRequestDispatcher(pagListarFutbolistas).forward(request, response);
            
}
protected void nuevoFutbolista(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    request.setAttribute("futbolista",new Futbolista());
    request.getRequestDispatcher(pagNuevoFutbolista).forward(request, response);
            
}
protected void guardarFutbolista(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    Futbolista fut =new Futbolista();
    
    fut.setIdfutbolista(Integer.parseInt(request.getParameter("idfutbolista")));
    fut.setNombre(request.getParameter("nombre"));
    fut.setGoles(Integer.parseInt(request.getParameter("goles")));
    fut.setSueldo(Double.parseDouble(request.getParameter("sueldo")));
    fut.setNombreEquipo(request.getParameter("nombreEquipo"));
    
    int result=0;
    if(fut.getIdfutbolista()==0){
        futDao.insertarFutbolista(fut);
    }else{
        futDao.editarFutbolista(fut);
    }
    
    response.sendRedirect("FutbolControlador?accion=listarFutbolistas");
            
}
protected void borrarFutbolista(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    int id=Integer.parseInt(request.getParameter("idfutbolista"));
int result=futDao.borrarFutbolistaPorId(id);
response.sendRedirect("FutbolControlador?accion=listarFutbolistas");
    
    
}
protected void editarFutbolista(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    int id=Integer.parseInt(request.getParameter("idfutbolista"));
   Futbolista fut= futDao.buscarFutbolistaPorId(id);

   if(fut!=null){
       request.setAttribute("futbolista",fut);
        request.getRequestDispatcher(pagNuevoFutbolista).forward(request, response);
   }else{
       response.sendRedirect("FutbolControlador?accion=listarFutbolistas");
   }
}

protected void listarEquipos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    request.setAttribute("equipos",this.futDao.listarTodosEquipos());
    request.getRequestDispatcher(pagListarEquipos).forward(request, response);
            
}
protected void nuevoEquipo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    request.setAttribute("equipo",new Equipo());
    request.getRequestDispatcher(pagNuevoEquipo).forward(request, response);
            
}
protected void guardarEquipo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    Equipo eq =new Equipo();
    
    eq.setIdequipo(Integer.parseInt(request.getParameter("idequipo")));
    eq.setNombre(request.getParameter("nombre"));
    eq.setDescripcion(request.getParameter("descripcion"));
    
    int result=0;
    if(eq.getIdequipo()==0){
        futDao.insertarEquipo(eq);
    }else{
        futDao.editarEquipo(eq);
    }
    
    response.sendRedirect("FutbolControlador?accion=listarEquipos");
            
}
protected void borrarEquipo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    int id=Integer.parseInt(request.getParameter("idequipo"));
int result=futDao.borrarEquipoPorId(id);
response.sendRedirect("FutbolControlador?accion=listarEquipos");
    
    
}
protected void editarEquipo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    int id=Integer.parseInt(request.getParameter("idequipo"));
   Equipo eq= futDao.buscarEquipoPorId(id);

   if(eq!=null){
       request.setAttribute("equipo",eq);
        request.getRequestDispatcher(pagNuevoEquipo).forward(request, response);
   }else{
       response.sendRedirect("FutbolControlador?accion=listarEquipos");
   }
}

protected void listarEmpresa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    request.setAttribute("futbolistas",this.futDao.listarFutbolistasConEquipo());
    request.getRequestDispatcher(pagListarEmpresa).forward(request, response);
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

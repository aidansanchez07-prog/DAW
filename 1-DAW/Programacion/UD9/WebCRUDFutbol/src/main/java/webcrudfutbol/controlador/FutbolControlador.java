package webcrudfutbol.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import webcrudfutbol.dao.FutbolDAO;
import webcrudfutbol.modelo.Equipo;
import webcrudfutbol.modelo.Futbolista;

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
    
     private final String pagListare="/vista/listare.jsp";
     private final String pagListarf="/vista/listarf.jsp";
    private final String pagNuevoe="/vista/nuevoe.jsp";
    private final String pagNuevof="/vista/nuevof.jsp";
    private final String pagGuardar="/vista/guardar.jsp";
    private final String pagEditar="/vista/editar.jsp";
    private final String pagBorrar="/vista/borrar.jsp";
    private final String pagListar="/vista/listar.jsp";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       String accion=request.getParameter("accion");
     
     switch(accion){
         case "listarf":
             listarf(request,response);
             break;
         case "nuevof":
             nuevof(request,response);
             break;
         case "guardarf":
             guardarf(request,response);
             break;
         case "borrarf":
             borrarf(request,response);
             break;
         case "editarf":
             editarf(request,response);
             break;
             case "listare":
             listare(request,response);
             break;
         case "nuevoe":
             nuevoe(request,response);
             break;
         case "guardare":
             guardare(request,response);
             break;
         case "borrare":
             borrare(request,response);
             break;
         case "editare":
             editare(request,response);
             break;
             case "listar":
             listar(request,response);
             break;
         default:
             throw new AssertionError();
     }
    }
    protected void listarf(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    request.setAttribute("futbolista",this.futDao.listarf());
    request.getRequestDispatcher(pagListarf).forward(request, response);
            
}
protected void listare(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    request.setAttribute("equipo",this.futDao.listare());
    request.getRequestDispatcher(pagListare).forward(request, response);
            
}
protected void nuevof(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    request.setAttribute("futbolista",new Futbolista());
    request.getRequestDispatcher(pagNuevof).forward(request, response);
            
}
protected void nuevoe(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    request.setAttribute("equipo",new Equipo());
    request.getRequestDispatcher(pagNuevoe).forward(request, response);
            
}
protected void guardarf(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    Futbolista fut =new Futbolista();
    
    fut.setIdfutbolista(Integer.parseInt(request.getParameter("idfutbolista")));
    fut.setNombre(request.getParameter("nombre"));
    fut.setGoles(Integer.parseInt(request.getParameter("goles")));
    fut.setSueldo(Double.parseDouble(request.getParameter("sueldo")));
    Equipo eq = new Equipo();
    eq.setNombre(request.getParameter("nombreEquipo"));
    fut.setEquipo(eq);
    
    int result=0;
    if(fut.getIdfutbolista()==0){
        futDao.insertarf(fut);
    }else{
        futDao.editarf(fut);
    }
    
    response.sendRedirect("FutbolControlador?accion=listarf");
            
}
protected void guardare(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    Equipo eq =new Equipo();
    
    eq.setIdequipo(Integer.parseInt(request.getParameter("idequipo")));
    eq.setNombre(request.getParameter("nombre"));
    eq.setDescripcion(request.getParameter("descripcion"));
    
    int result=0;
    if(eq.getIdequipo()==0){
        futDao.insertare(eq);
    }else{
        futDao.editare(eq);
    }
    
    response.sendRedirect("FutbolControlador?accion=listare");
            
}
protected void borrarf(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    int id=Integer.parseInt(request.getParameter("idfutbolista"));

int result=futDao.borrarf(id);
response.sendRedirect("FutbolControlador?accion=listarf");
    
    
}
protected void borrare(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    int id=Integer.parseInt(request.getParameter("idequipo"));

int result=futDao.borrare(id);
response.sendRedirect("FutbolControlador?accion=listare");
    
    
}
protected void editarf(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    int id=Integer.parseInt(request.getParameter("idfutbolista"));
   Futbolista fut= futDao.buscarPorIdf(id);

   if(fut!=null){
       request.setAttribute("futbolista",fut);
        request.getRequestDispatcher(pagNuevof).forward(request, response);
   }else{
       response.sendRedirect("FutbolControlador?accion=listarf");
   }
}
protected void editare(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    int id=Integer.parseInt(request.getParameter("idequipo"));
   Equipo eq= futDao.buscarPorIde(id);

   if(eq!=null){
       request.setAttribute("equipo",eq);
        request.getRequestDispatcher(pagNuevoe).forward(request, response);
   }else{
       response.sendRedirect("FutbolControlador?accion=listare");
   }
        


    
    
}
protected void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    request.setAttribute("futbolista", this.futDao.listar());
    request.getRequestDispatcher(pagListar).forward(request, response);           
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

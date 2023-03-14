import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class P4 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet P4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Name : " + request.getParameter("fname").toUpperCase()+ " " + request.getParameter("mname").toUpperCase()+ " " + request.getParameter("lname").toUpperCase() + "</h1>");
            String gender = request.getParameter("g");
            if("ma".equals(gender)){
                out.println("<h1>Gender : MALE </h1>");
            }
            if("fe".equals(gender)){
                out.println("<h1>Gender : FEMALE </h1>");
            }
            out.println("<h1>Age : " + request.getParameter("age").toUpperCase() + "</h1>");            
            out.println("<h1>Address : " + request.getParameter("add").toUpperCase() + "</h1>");
            out.println("<h1>Anual Income  : " + request.getParameter("inc") + "</h1>");
            int income = Integer.parseInt(request.getParameter("inc"));
            double  tax ;
            String rule ;
            if (income <= 250000) {
                tax = 0;
                rule = "for income <= 250000 , tax = 0 " ;
            } else if (income > 250000 && income <= 500000) {
                tax = (income - 250000) * 0.05;
                rule = "for income > 250000 && income <= 500000 ,  tax = (income - 250000) * 0.05";
            } else if (income > 500000 && income <= 1000000) {
                tax = 12500 + (income - 500000) * 0.20;
                rule = "for income > 500000 && income <= 1000000 ,  tax = 12500 + (income - 500000) * 0.20";

            } else {
                tax = 112500 + (income - 1000000) * 0.30;
                rule = "for income > 1000000 , tax = 112500 + (income - 1000000) * 0.30";
            }
            out.println("<h1>Your Tax is : " + tax + "</h1>");
            out.println("<h3>(" + rule + ")</h3>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

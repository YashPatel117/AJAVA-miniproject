/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author yeshp
 */
@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>\n" +
"<head>\n" +
"    <title>Resume</title>\n" +
"    <style>\n" +
"        .main{\n" +
"            width: 520px;\n" +
"            height: 730px;\n" +
"            background-color: rgb(0, 0, 0);\n" +
"            margin-left: 25%;\n" +
"            font-family: 'Trebuchet MS', sans-serif;\n" +
"        }\n" +
"        .d12{\n" +
"            width: 300px;\n" +
"            height: 730px;\n" +
"            float: left;\n" +
"        }\n" +
"        .d0{\n" +
"            width: 300px;\n" +
"            height: 100px;\n" +
"        }\n" +
"        .d00{\n" +
"            width: 100px;\n" +
"            height: 20px;\n" +
"            background-color: rgb(244 192 71 / 99%);\n" +
"        }\n" +
"        .d1{\n" +
"            height: 300px;\n" +
"            width: 300px;\n" +
"        }\n" +
"        .d2{\n" +
"            width: 300px;\n" +
"            height: 330px;\n" +
"            background-color: rgb(244 192 71 / 99%) ;\n" +
"            padding-left: 10%;\n" +
"            line-height: 1.6;\n" +
"        }\n" +
"        .d34{\n" +
"            width: 220px;\n" +
"            height: 730px;\n" +
"            float: left;\n" +
"        }\n" +
"        .do{\n" +
"            width: 220px;\n" +
"            height: 200px;\n" +
"        }\n" +
"        .d3{\n" +
"            width: 220px;\n" +
"            height: 360px;\n" +
"            background-color: white;\n" +
"            padding-left: 1%;\n" +
"        }\n" +
"        .d4{\n" +
"            width: 220px;\n" +
"            height: 170px;\n" +
"            background-color: rgb(0, 0, 0);\n" +
"            color: white;\n" +
"        }\n" +
"        .dot {\n" +
"            height: 12px;\n" +
"            width: 12px;\n" +
"            background-color: rgb(255, 255, 255);\n" +
"            border-radius: 50%;\n" +
"            display: inline-block;\n" +
"        }\n" +
"        .dot1 {\n" +
"            height: 12px;\n" +
"            width: 12px;\n" +
"            background-color: rgb(0, 0, 0);\n" +
"            border-radius: 50%;\n" +
"            display: inline-block;\n" +
"        }\n" +
"    </style>\n" +
"</head>\n" +
"<body bgcolor=\"grey\">\n" +
"    <div class=\"main\">\n" +
"        <div class=\"d12\">\n" +
"            <div class=\"d0\" style=\"color: white; text-align: right;\">\n" +
"                <div class=\"d00\" > </div> <br><br><br>  " + 
                    request.getParameter("job") +"\n" +
"            </div>\n" +
"            <div class=\"d1\">\n" +
"                <div style=\"background-color: black; height: 20px; width: 200px; position: absolute; margin-top: 280px; color: white; text-align: center;\">About Me</div>\n" +
"                <img src=\""+ request.getParameter("photo") +"\" style=\"width:100%; height:100%; color: aqua;\" alt=\"IMAGE NOT FOUND\">\n" +
"            </div>\n" +
"            <div class=\"d2\">\n" +
"                <br><br>\n" +
"                <b>SKIILS</b><br>\n" +
"                <table>\n" +
"                    <tr>\n" +
"                        <td>"+ request.getParameter("sk1")+"</td>\n" +
"                        <td>&nbsp;</td>\n" +
"                        <td><progress id=\"progress\" value=\""+ request.getParameter("sk1p") +"\" max=\"100\" style=\"width: 135px;\"></progress></td>\n" +
"                    </tr>\n" +
"                    <tr>\n" +
"                        <td>"+ request.getParameter("sk2")+"</td>\n" +
"                        <td>&nbsp;</td>\n" +
"                        <td><progress id=\"progress\" value=\""+ request.getParameter("sk1p") +"\" max=\"100\" style=\"width: 135px;\"></progress></td>\n" +
"                    </tr>\n" +
"                    <tr>\n" +
"                        <td>"+ request.getParameter("sk3")+"</td>\n" +
"                        <td>&nbsp;</td>\n" +
"                        <td><progress id=\"progress\" value=\""+ request.getParameter("sk1p") +"\" max=\"100\" style=\"width: 135px;\"></progress></td>\n" +
"                    </tr>\n" +
"                    <tr>\n" +
"                        <td>"+ request.getParameter("sk4")+"</td>\n" +
"                        <td>&nbsp;</td>\n" +
"                        <td><progress id=\"progress\" value=\""+ request.getParameter("sk1p") +"\" max=\"100\" style=\"width: 135px;\"></progress></td>\n" +
"                    </tr>\n" +
"                </table>" +
"                <b>Language</b> \n" +
"                <br>&emsp;&nbsp;&nbsp;&nbsp;" + 
                    request.getParameter("l1") +"\n" +
"                \n" +
"                <br>&emsp;&nbsp;&nbsp;&nbsp;" + 
                    request.getParameter("l2") +" \n" +
"                \n" +
"            </div>\n" +
"        </div>\n" +
"        <div class=\"d34\">\n" +
"            <div class=\"do\" style=\"color: rgb(255, 255, 255); font-size: 50px; padding-left: 40px; text-size-adjust: 80%; \"> <br> " + 
                    request.getParameter("fname") +" <br>" + 
                    request.getParameter("lname") +"</div>\n" +
"            <div class=\"d3\">\n" +
"                <br>\n" +
"                <b style=\"font-size: 100%;\">Education</b><br><br>\n" +
"                <i style=\"font-size: 80%;\">" + 
                    request.getParameter("cf") +"-" +  
                    request.getParameter("ct") +"</i><br>\n" +
"                <b style=\"font-size: 80%;\">" + 
                    request.getParameter("edu") +"</b>\n" +
"                <p style=\"font-size: 50%;\">" + 
                    request.getParameter("course") +"</p>\n" +
"                <br>\n" +
"                <b style=\"font-size: 100%;\">Work Experience</b><br><br>\n" +
"                <i style=\"font-size: 80%;\">" + 
                    request.getParameter("wf1") +"-" +  
                    request.getParameter("wt1") +"</i><br>\n" +
"                <b style=\"font-size: 80%;\">" + 
                    request.getParameter("cn1") +"</b><br>\n" +
"                <p style=\"font-size: 50%;\">" + 
                    request.getParameter("we1") +"</p>\n" +
"                <i style=\"font-size: 80%;\">" + 
                    request.getParameter("wf2") +"-" +  
                    request.getParameter("wt2") +"</i><br>\n" +
"                <b style=\"font-size: 80%;\">" + 
                    request.getParameter("cn2") +"</b>\n" +
"                <p style=\"font-size: 50%;\">" + 
                    request.getParameter("we2") +"</p>\n" +
"                \n" +
"            </div>\n" +
"            <div class=\"d4\">\n" +
"                <br>\n" +
"                <b>CONTACT</b>\n" +
"                <ul>\n" +
"                    <li style=\"font-size: 80%;\">" + 
                    request.getParameter("add") +"</li><br>\n" +
"                    <li style=\"font-size: 80%;\">" + 
                    request.getParameter("mo") +"</li><br>\n" +
"                    <li style=\"font-size: 80%;\">" + 
                    request.getParameter("email") +"</li><br>\n" +
"                    \n" +
"                </ul>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"</body>\n" +
"</html>");
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

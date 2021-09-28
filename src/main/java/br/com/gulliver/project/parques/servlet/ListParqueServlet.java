package br.com.gulliver.project.parques.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ListParque")
public class ListParqueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		
		List<Parque> listParques = banco.getParques();
		
		request.setAttribute("parques", listParques);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listParques.jsp");
		rd.forward(request, response);
	}

}

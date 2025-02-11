package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/ComentarioLibro")
public class ComentarioLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ComentarioLibro() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		String[] comentarios = { "Friedrich Nietzsche, tambien llamado el ateo nihislita o el filosofo con martillo.",
				"Leandro Fernandez de Moratin escribio esta obra en los albores de 1800. Estrenada en 1806 en el teatro de la Cruz.",
				"Gonzalo Alvarez y Pedro Pablo Perez presentan el libro mas completo y comprensible de seguridad informatica para la empresa.",
				"Introduccion a las principales tecnologias de la plataforma." };
		int seleccionado = Integer.parseInt(request.getParameter("tit"));
		out.println(comentarios[seleccionado]);
		out.close();
	}
}
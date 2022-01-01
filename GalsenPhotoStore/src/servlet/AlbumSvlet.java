package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AlbumDAO;

/**
 * Servlet implementation class NewAlbum
 */
@WebServlet({"/detailsalbum", "/createalbum"})
public class AlbumSvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VUE_DETAIL = "/WEB-INF/album/detailsalbum.jsp";
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		try { 
			String requestedUrl = request.getServletPath();
			if (requestedUrl.equals("/album/detailsalbum")) {
				request.setAttribute("albumDetails", AlbumDAO.getAlbumById(Integer.parseInt(request.getParameter("album"))));
				getServletContext().getRequestDispatcher(VUE_DETAIL).forward(request, response);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		try { } catch (Exception e) {
			// TODO: handle exception
		}
	}

}

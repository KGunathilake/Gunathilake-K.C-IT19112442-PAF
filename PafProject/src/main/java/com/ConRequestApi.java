package com;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.PathParam;

import com.google.protobuf.Parser;

import model.ConRequest;
import utils.RandomID;
import utils.SqlQueries;

/**
 * Servlet implementation class ConRequestApi
 */
@WebServlet("/ConRequestApi")
public class ConRequestApi extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SqlQueries query = new SqlQueries();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConRequestApi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ConRequest model = new ConRequest();
		RandomID id = new RandomID();
		
		model.setId(id.getuniqueid());
		model.setName(request.getParameter("name"));
		model.setNic(request.getParameter("nic"));
		model.setEmail(request.getParameter("email"));
		model.setStreet(request.getParameter("street"));
		model.setPostalCode(Integer.parseInt( request.getParameter("postalCode")));
		model.setCity(request.getParameter("city"));
		model.setContact(Integer.parseInt(request.getParameter("contact")));
		model.setMessage(request.getParameter("message"));
		model.setDistrict(request.getParameter("district"));
		model.setContype(request.getParameter("contype"));
		model.setStatus(request.getParameter("status"));
			
		String output = this.query.Insert(model);
		
		response.getWriter().write(output);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Map paras = getParasMap(request);
		
		ConRequest model = new ConRequest();
		
		model.setId(Integer.parseInt((String) paras.get("hideID")));
		model.setName((String)paras.get("name"));
		model.setNic((String)paras.get("nic"));
		model.setEmail((String)paras.get("email"));
		model.setStreet((String)paras.get("street"));
		model.setPostalCode(Integer.parseInt((String)paras.get("postalCode")));
		model.setCity((String)paras.get("city"));
		model.setContact(Integer.parseInt((String)paras.get("contact")));
		model.setMessage((String)paras.get("message"));
		model.setDistrict((String)paras.get("district"));
		model.setContype((String)paras.get("contype"));
		model.setStatus((String)paras.get("status"));
		
		String output = this.query.Update(
		model.getId(),model.getName(),model.getNic(),model.getEmail(),model.getStreet(),model.getPostalCode(),model.getCity(),
		model.getContact(),model.getMessage(),model.getDistrict(),model.getContype(),model.getStatus()
		);
		
		response.getWriter().write(output);
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String output = query.delete(Integer.parseInt(request.getParameter("requestId")));
		
		response.getWriter().write(output);
	}
	
	
	private static Map getParasMap(HttpServletRequest request){
		Map<String, String> map = new HashMap<String, String>();
	
		try{
			
		Scanner scanner = new Scanner(request.getInputStream(), "UTF-8");
		String queryString = scanner.hasNext() ?
		scanner.useDelimiter("\\A").next() : "";
		scanner.close();
		String[] params = queryString.split("&");
		
				for (String param : params){
					String[] p = param.split("=");
					map.put(p[0], p[1]);
				}
		}
		catch (Exception e){
			
		}
			
		return map;
	}
}



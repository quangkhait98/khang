package com.dat.severlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DemoSevelet")
public class DemoSevelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DemoSevelet() {
        super();     
    }   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
        out.println("Sư Phạm Kỹ Thuật");
	}
}

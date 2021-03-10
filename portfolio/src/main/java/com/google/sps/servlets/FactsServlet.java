package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;
import java.util.Scanner;
import java.util.*;
import com.google.gson.Gson;

/** Handles requests sent to the /facts URL. Try running a server and navigating to /facts! */
@WebServlet("/facts")
public class FactsServlet extends HttpServlet {
    ArrayList<String> facts = new ArrayList<String>( 
            Arrays.asList("I am brazilian!", "I am trying to learn Japanese", "If I could not be a coder I would like to be a lawyer", "One of my favorite cities in the world is Munich!")); 
    @Override
  public void doGet(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
    Gson gson = new Gson();
    String json = gson.toJson(facts);
    
    response.setContentType("application/json;");
    response.getWriter().println(json);
  }
}
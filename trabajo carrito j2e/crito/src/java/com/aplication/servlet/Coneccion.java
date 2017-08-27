/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplication.servlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author sahian
 */
public class Coneccion {
    private Connection con;
    private PreparedStatement consulta;
    private ResultSet datos;
    private String server,user,bd,pass;
    public Coneccion()
    {
        this.server="localhost:8080";
        this.bd="test";
        this.user="root";
        this.pass="";
    }
    public void con() throws SQLException
    {
        try 
        {
            Class.forName("con.mysql.jdbc.Driver");
            this.con=DriverManager.getConnection("jdbc:mysql://"+this.server+"/"+this.bd,this.user,this.pass);
            
        }catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    public void desconectar() throws SQLException
    {
        this.con.close();
    }
    public ResultSet getDatos(String sql) throws SQLException
    {
        this.con();
        this.consulta=this.con.prepareStatement(sql);
        this.datos=this.consulta.executeQuery();
        return this.datos;
        
    }
}

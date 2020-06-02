/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author LONG
 */


public class Customer {
    
    
   
    public String[][] getAllCustomer(){
        try{
             System.out.println("in getAllCustomer");
             
            connection con = connection.getInstance();
            Statement sta = con.conn.createStatement();
            
            ResultSet res = sta.executeQuery("SELECT * FROM customer"); //
            
            
             System.out.println("res get data");
             
            res.last();
            int count = res.getRow();
            res.beforeFirst();
            String[][] ret = new String[count][5];
            int i = 0;
            while(res.next()){
                ret[i][0] = res.getString(1);
                ret[i][1] = res.getString(2);
                ret[i][2] = res.getString(3);
                ret[i][3] = res.getString(4);
                ret[i][4] = res.getString(5);
                i++;
            }
            //sta.close();
            return ret;

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.powerking.pointage.lib;

import com.powerking.pointage.ui.Historique;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;

/**
 *
 * @author delll
 */
public class AdminDAO {

    public Connection cnx;
    public int matricule;

    //private String x1, x2;

    public void connexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_pointage", "root", "");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }

    }
    
    public boolean tableHistorique() {
        Statement s = null;
        String req = "SELECT matricule,nom,deparetment,taux_pre,date,heure_deb,heure_fin  FROM employe e , pointage p where e.matricule =p.matricule" ;
        try {
            s = cnx.createStatement();
            ResultSet rs = s.executeQuery(req);
            ResultSetMetaData rsmt = rs.getMetaData();
            int c = rsmt.getColumnCount();
            Vector column = new Vector(c);
            for(int i =1;i<= c ;i++)
            {
                column.add(rsmt.getColumnName(i));
            }
            Vector data = new Vector();
            Vector row = new Vector();
            while(rs.next())
            { row = new Vector(c);
            for(int i=0;i<=c;i++)
            { row.add(rs.getString(i));
            }
            data.add(row);
          //  JFrame frame = new JFrame();
            
        }
            return true;
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    

    public boolean authentification(String login, String password) {
        Statement s = null;
        String req = "SELECT * FROM admin where login ='" + login + "' AND pass ='" + password + "'";
        try {
            s = cnx.createStatement();
            ResultSet rs = s.executeQuery(req);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        }
    
  public boolean calculsalaireJour(String salaire,String jour,String nbrpres,int mat) { 

                // TODO add your handling code here:
 String req = "SELECT salaire_jour, date, taux_pre FROM employe e , pointage p WHERE p.matricule = e.matricule AND p.matricule = "+mat;
                
                
              try {
           Statement s = cnx.createStatement();
            ResultSet rs = s.executeQuery(req);
                
                   while (rs.next()){
                    salaire=(rs.getString(1)+" dt");
                    jour=(rs.getString(2));
                    nbrpres =(rs.getString(3));
                }
                return true;
           
              }
         catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
  }
     


    public static void remplirBD(String chemin, Connection cnx) throws FileNotFoundException, IOException, SQLException {
        Statement s = null;
        int i = 0;
        String req = "";
        String req1 = "";
        s = cnx.createStatement();
        req = "TRUNCATE TABLE pointage";
        req1 = "TRUNCATE TABLE employe";
        s.executeUpdate(req);
        s.executeUpdate(req1);
        BufferedReader br = new BufferedReader(new FileReader(chemin));
        try {
            String line = br.readLine();
            while (line != null) {
                if (i != 0) {
                    line = br.readLine();
                    if (line != null) {
                        String[] li = line.split(";");
                        System.err.println(li.length + "");
                        if (li.length == 5) {
                            String[] p = li[4].split(" ");
                            String[] s1 = p[0].split(":");
                            String[] s2 = p[1].split(":");
                            int x1 = Integer.parseInt(s1[0]);
                            int x2 = Integer.parseInt(s2[0]);
                            String str = ((x2 - x1) * 3) + "dt";
                            req = "INSERT INTO pointage VALUES(" + i + ",'" + li[3] + "','" + p[0] + "','" + p[1] + "'," + li[0] + ")";
                            req1 = "INSERT INTO employe VALUES(" + li[0] + ",'" + li[1] + "','" + li[2] + "'," + (x2 - x1) + "," + (x2 - x1) * 3 + ")";
                            s.executeUpdate(req1);
                        } else {
                            req = "INSERT INTO pointage(id,mat,nom, departement,date) VALUES(" + i + "," + li[0] + ",'" + li[1] + "','" + li[2] + "','" + li[3] + "')";
                        }
                        System.err.println(req);
                        s.executeUpdate(req);

                    }
                }
                i++;
            }
        } finally {
            br.close();
        }
    }

    public void parcourir() throws IOException {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        chooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            public boolean accept(File f) {
                return f.getName().toLowerCase().endsWith(".csv")
                        || f.isDirectory();
            }

            public String getDescription() {
                return "txt File";
            }
        });

        int r = chooser.showOpenDialog(new JFrame());
        if (r == JFileChooser.APPROVE_OPTION) {
            String name = chooser.getSelectedFile().getAbsolutePath();
            System.out.println(name);
            try {
                AdminDAO.remplirBD(name, cnx);

            } catch (IOException ex) {
                Logger.getLogger(Historique.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Historique.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void exportCSV(Connection cnx) throws IOException {

        FileWriter writer = new FileWriter("C:\\Users\\delll\\Desktop\\historique.csv");

        writer.append("mat");
        writer.append(';');
        writer.append("nom");
        writer.append(';');
        writer.append("departement");
        writer.append(';');
        writer.append("date");
        writer.append(';');
        writer.append("date_deb");
        writer.append(';');
        writer.append("date_fin");
        writer.append(';');
        writer.append("taux");
        writer.append(';');
        writer.append('\n');
        try {
            String req = "SELECT e.matricule , e.nom, e.departemet, p.date, p.heure_deb, p.heure_fin, e.taux_pre  FROM employe e , pointage p WHERE e.matricule = p.matricule";
            Statement s = cnx.createStatement();
            ResultSet rs = s.executeQuery(req);

            while (rs.next()) {
                writer.append(rs.getInt(1) + "");
                writer.append(';');
                writer.append(rs.getString(2));
                writer.append(';');
                writer.append(rs.getString(3));
                writer.append(';');
                writer.append(rs.getString(4));
                writer.append(';');
                writer.append(rs.getString(5));
                writer.append(';');
                writer.append(rs.getString(6));
                writer.append(';');
                writer.append(rs.getInt(7) + "");
                writer.append(';');
                writer.append('\n');
            }

            writer.flush();
            writer.close();
            JOptionPane.showMessageDialog(null, "DONE");
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void exportCSVsalaireJour(Connection cnx) throws IOException {

        FileWriter writer = new FileWriter("C:\\Users\\delll\\Desktop\\salaireJour.csv");

        writer.append("matricule");
        writer.append(';');
        writer.append("nom");
        writer.append(';');
        writer.append("date");
        writer.append(';');
        writer.append("salaire_jour");
        writer.append(';');
        writer.append("taux_pre");
        writer.append(';');
        writer.append('\n');
        try {
            String req = "SELECT e.matricule, e.nom, date, salaire_jour,  taux_pre FROM employe e , pointage p WHERE p.matricule = e.matricule";
            Statement s = cnx.createStatement();
            ResultSet rs = s.executeQuery(req);

            while (rs.next()) {
                writer.append(rs.getInt(1) + "");
                writer.append(';');
                writer.append(rs.getString(2) + "");
                writer.append(';');
                writer.append(rs.getString(3));
                writer.append(';');
                writer.append(rs.getInt(4) + "");
                writer.append(';');
                writer.append(rs.getInt(5) + "");
                writer.append(';');
                writer.append('\n');
            }

            writer.flush();
            writer.close();

            JOptionPane.showMessageDialog(null, "DONE");
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

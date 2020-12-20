package Db_PGDC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import File_Seting.*;

public class Db_App extends seting_importation {
    ArrayList<String> liste = new ArrayList<>();
    String[] Input_Setting = seting_importation.catsh_setting(
            "C:/Users/Mohyi eddine/Desktop/ProjectGestionDesNotes/PGDN/mysql_seting/url_user_password.txt");

    public ArrayList<String> GetDb_Nom(String s) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Input_Setting[0] + "é" + Input_Setting[1], Input_Setting[2],
                    Input_Setting[3]);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from étudiants where class='" + s + "'");

            int i = 0;
            while (rs.next()) {
                liste.add(rs.getString("nom"));
                i = i + 1;

            }

        }

        catch (Exception e) {

            e.printStackTrace();
        }

        return liste;
    }

    public void setDb_note(float v) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Input_Setting[0] + "é" + Input_Setting[1], Input_Setting[2],
                    Input_Setting[3]);
            Statement st = conn.createStatement();
            // st.executeUpdate("insert into note (note) values ('20')");
            st.executeUpdate("insert into note (note) values ('" + v + "')");

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}

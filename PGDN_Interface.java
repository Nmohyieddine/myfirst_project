package APP_Interface;

import javax.swing.*;

import Db_PGDC.Db_App;

import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

public class PGDN_Interface extends JFrame implements ActionListener {

    JTextField t = new JTextField(20);
    JLabel l = new JLabel("Class");
    JLabel l1 = new JLabel("");
    JButton b = new JButton("search");
    List liste = new List();
    List liste1 = new List();
    JLabel l2 = new JLabel("note");
    JButton b1 = new JButton("add");
    JTextField t1 = new JTextField(20);

    public PGDN_Interface() {
        JPanel jp1 = new JPanel();
        jp1.setLayout(new FlowLayout());
        jp1.add(l);
        jp1.add(t);
        jp1.add(b);
        jp1.add(l2);
        jp1.add(t1);
        jp1.add(b1);
        this.add(jp1, BorderLayout.NORTH);
        JPanel jp2 = new JPanel();
        jp2.setLayout(new FlowLayout());
        jp2.add(liste);
        jp2.add(liste1);
        this.add(jp2, BorderLayout.CENTER);
        JPanel jp3 = new JPanel();
        jp3.setLayout(new FlowLayout());
        jp3.add(l1);
        this.add(jp3, BorderLayout.SOUTH);
        this.setBounds(30, 30, 200, 200);
        this.setVisible(true);

        b.addActionListener(this);
        b1.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {

            Db_App db_app = new Db_App();
            String s = t.getText();
            ArrayList<String> A = db_app.GetDb_Nom(s);
            for (int i = 0; i < A.size(); i++) {
                liste.add(A.get(i));

            }

        }
        if (e.getSource() == b1) {
            Db_App db_app = new Db_App();
            float s = Float.parseFloat(t1.getText());
            db_app.setDb_note(s);
        }

    }

}

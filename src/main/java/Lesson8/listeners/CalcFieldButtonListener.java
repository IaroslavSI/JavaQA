package Lesson8.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcFieldButtonListener implements ActionListener {
    private JTextField inputField;

    String s0, s1, s2;

    // default constructor
    CalcFieldButtonListener()
    {
        s0 = s1 = s2 = "";
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();


        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9')) {

            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;


            inputField.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == 'C') {

            s0 = s1 = s2 = "";

            inputField.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == '=') {

            double te;

            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));


            inputField.setText(s0 + s1 + s2 + "=" + te);


            s0 = Double.toString(te);

            s1 = s2 = "";
        }
        else {

            if (s1.equals("") || s2.equals(""))
                s1 = s;

            else {
                double te;

                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));

                s0 = Double.toString(te);

                s1 = s;

                s2 = "";
            }

            inputField.setText(s0 + s1 + s2);
        }
    }
}

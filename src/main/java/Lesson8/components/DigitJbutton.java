package Lesson8.components;

import javax.swing.*;
import java.awt.*;

public class DigitJbutton extends JButton {
    public DigitJbutton(String text) {
        super(text);
        setFont(new Font("TimesRoman", Font.PLAIN, 25));
        setBackground(new Color(245, 141, 56));
    }
}

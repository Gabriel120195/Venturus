package Aula02;

import java.awt.*;

public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit i = Toolkit.getDefaultToolkit();
        Dimension d = i.getScreenSize();
        System.out.println("RESOLUÇÃO: " +d.width + " x " +d.height);
    }
}

import controllers.SQLConnection;
import controllers.TipoDeSeguroController;
import models.TipoDeSeguro;
import ui.MenuPrincipal;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        JFrame frame = new JFrame();
//        frame.setContentPane(new MenuPrincipal().getJpanel());
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);

        TipoDeSeguroController tipoDeSeguroController = new TipoDeSeguroController();
        for (TipoDeSeguro tipo :
                tipoDeSeguroController.getTipoDeSeguros()) {
            System.out.println(tipo.toString());
        }
    }
}
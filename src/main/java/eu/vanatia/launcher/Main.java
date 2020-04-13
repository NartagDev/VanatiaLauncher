package eu.vanatia.launcher;

import fr.arinonia.arilibfx.utils.AriLogger;
import javafx.application.Application;

import javax.swing.*;

public class Main {

    public static AriLogger logger;

    public static void main(String[] args) {

        logger = new AriLogger("Vanatia");
        try{
            Class.forName("javafx.application.Application");
            Application.launch(FxApplication.class, args);
        }catch(ClassNotFoundException e){
            logger.warn("JavaFx not found.");
            JOptionPane.showMessageDialog(null, "Une erreur avec Java s'est produite.\n" + e.getMessage() + " Not Found", "Erreur Java", JOptionPane.ERROR_MESSAGE);


        }

    }
}

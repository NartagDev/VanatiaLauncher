package eu.vanatia.launcher;

import eu.vanatia.launcher.ui.panels.PanelManager;
import javafx.stage.Stage;

public class VanatiaLauncher {

    private PanelManager panelManager;

    public void init(Stage stage){

        this.panelManager = new PanelManager(this, stage);
        this.panelManager.init();

    }

}

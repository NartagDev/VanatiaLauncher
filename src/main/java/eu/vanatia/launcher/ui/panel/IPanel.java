package eu.vanatia.launcher.ui.panel;

import eu.vanatia.launcher.ui.panels.PanelManager;
import javafx.scene.layout.GridPane;

public interface IPanel {

    void init(PanelManager panelManager);
    GridPane getLayout();
    void onShow();


}

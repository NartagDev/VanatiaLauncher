package eu.vanatia.launcher.ui.panels;


import eu.vanatia.launcher.ui.panel.Panel;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;

import java.util.concurrent.atomic.AtomicBoolean;

public class PanelLogin extends Panel {



    @Override
    public void init(PanelManager panelManager) {
        super.init(panelManager);
        GridPane loginPanel = new GridPane();
        GridPane mainPanel = new GridPane();
        GridPane bottomPanel = new GridPane();
        AtomicBoolean connectWithMoj = new AtomicBoolean(false);

        loginPanel.setMaxWidth(400);
        loginPanel.setMinWidth(400);
        loginPanel.setMaxHeight(580);
        loginPanel.setMinHeight(580);

        GridPane.setVgrow(loginPanel, Priority.ALWAYS);
        GridPane.setHgrow(loginPanel, Priority.ALWAYS);
        GridPane.setValignment(loginPanel, VPos.CENTER);
        GridPane.setHalignment(loginPanel, HPos.CENTER);

        RowConstraints bottomConstraints= new RowConstraints();
        bottomConstraints.setValignment(VPos.BOTTOM);
        bottomConstraints.setMaxHeight(55);
        loginPanel.getRowConstraints().addAll(new RowConstraints(), bottomConstraints);
        loginPanel.add(mainPanel, 0, 0);
        loginPanel.add(bottomPanel, 0, 1);

        GridPane.setVgrow(mainPanel, Priority.ALWAYS);
        GridPane.setHgrow(mainPanel, Priority.ALWAYS);
        GridPane.setVgrow(bottomPanel, Priority.ALWAYS);
        GridPane.setHgrow(bottomPanel, Priority.ALWAYS);

        mainPanel.setStyle("-fx-background-color: #333333;");

        bottomPanel.setStyle("-fx-background-color: #333333; -fx-opacity: 50%;");

        this.layout.getChildren().addAll(mainPanel, bottomPanel);

    }
}

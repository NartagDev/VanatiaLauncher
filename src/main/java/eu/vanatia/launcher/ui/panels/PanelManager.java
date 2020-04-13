package eu.vanatia.launcher.ui.panels;

import eu.vanatia.launcher.VanatiaLauncher;
import eu.vanatia.launcher.ui.panel.IPanel;
import eu.vanatia.launcher.ui.panels.includes.TopPanel;
import fr.arinonia.arilibfx.AriLibFX;
import fr.arinonia.arilibfx.ui.utils.ResizeHelper;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PanelManager {

    private final VanatiaLauncher vanatiaLauncher;
    private final Stage stage;
    private GridPane layout;
    private TopPanel topPanel = new TopPanel();
    private GridPane centerPanel = new GridPane();



    public PanelManager(VanatiaLauncher vanatiaLauncher, Stage stage) {
        this.vanatiaLauncher = vanatiaLauncher;
        this.stage = stage;
    }

    public void init(){
        this.stage.setTitle("Vanatia - Launcher");
        this.stage.setMinWidth(1280);
        this.stage.setWidth(1280);
        this.stage.setMinHeight(720);
        this.stage.setHeight(720);
        this.stage.initStyle(StageStyle.UNDECORATED);
        this.stage.centerOnScreen();
        this.stage.show();
        this.layout = new GridPane();
        this.layout.setStyle(AriLibFX.setResponsiveBackground("https://vanatia.000webhostapp.com/bg.png"));
        this.stage.setScene(new Scene(this.layout));

        RowConstraints topPanelConstraints = new RowConstraints();
        topPanelConstraints.setValignment(VPos.TOP);
        topPanelConstraints.setMinHeight(25);
        topPanelConstraints.setMaxHeight(25);
        this.layout.getRowConstraints().addAll(topPanelConstraints, new RowConstraints());
        this.layout.add(this.topPanel.getLayout(), 0, 0);
        this.topPanel.init(this);

        this.layout.add(this.centerPanel, 0, 1);
        GridPane.setVgrow(this.centerPanel, Priority.ALWAYS);
        GridPane.setHgrow(this.centerPanel, Priority.ALWAYS);
        ResizeHelper.addResizeListener(this.stage);
    }

    public void showPanel(IPanel panel){

        this.centerPanel.getChildren().clear();
        this.centerPanel.getChildren().add(panel.getLayout());
        panel.init(this);
        panel.onShow();


    }

    public Stage getStage() {
        return stage;
    }

    public VanatiaLauncher getVanatiaLauncher() {
        return vanatiaLauncher;
    }

    public TopPanel getTopPanel() {
        return topPanel;
    }

}

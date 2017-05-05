package org.clevermonkeylabs.labchimp.view;

import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import org.clevermonkeylabs.framework.controller.Controller;
import org.clevermonkeylabs.framework.view.ControllableView;
import org.clevermonkeylabs.framework.view.Position;
import org.clevermonkeylabs.framework.view.View;
import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

/**
 * Created by Thomas on 5/5/2017.
 */
public class CodeEditorView extends ControllableView {
    private CodeArea codeEditor;

    public CodeEditorView(Position position, Controller<CodeEditorView, ?> controller) {
        super(position,controller);
    }

    @Override
    public Node buildView() {
        /*
        ORIGINAL CODE_AREA SETUP

        // Load in RichTextFx editor
        CodeArea codeArea = new CodeArea();
        codeArea.setStyle("-fx-font-size: 22");
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));

        VBox codeEditor = (VBox) primaryStage.getScene().lookup("#codeEditor");
        VirtualizedScrollPane codeEditorPane = new VirtualizedScrollPane<>(codeArea);
        VBox.setVgrow(codeEditorPane, Priority.ALWAYS);
        codeEditor.getChildren().add(codeEditorPane);
        */

        codeEditor = new CodeArea();
        codeEditor.setParagraphGraphicFactory(LineNumberFactory.get(codeEditor));
        StackPane stackPane = new StackPane(new VirtualizedScrollPane<>(codeEditor));
        return stackPane;
    }
}

package numerosporextenso;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController {
Integer numero;

    @FXML
    private Button button;

    @FXML
    private TextField cxtext;

    @FXML
    private TextField cxnum;

    @FXML
    private Label label;

    @FXML
    void transcrever(ActionEvent event) {
        numero=Integer.valueOf(cxnum.getText());
        cxtext.setText(verificaNumero(numero));
        
    }

    private String verificaNumero(Integer numero) {
                String posicao;
        if (numero == 1)
            posicao=" UM ";
        else if (numero == 2)
            posicao=" DOIS";
        else if (numero == 3)
            posicao=" TRES ";
        else if (numero == 4)
            posicao=" QUATRO ";
        else if (numero == 5)
            posicao=" CINCO ";
        else
            posicao=" NÚMERO INVALIDO";
        return posicao;
    }

}

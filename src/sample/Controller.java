package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {
    public Button btnEndG;
    public Button btnNewG;
    public Button btnResetG;
    private Game game;

    public Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15;

    public void tileClick(ActionEvent actionEvent) {
        String temp = ((Button) actionEvent.getSource()).getId().substring(3); // get the id of the pressed button
        int value = Integer.parseInt(temp);
        game.nextMove(value);
        if (game.getMap() != null)
            reConstruct();
    }

    private void reConstruct() {
        Tile[][] arr = game.getMap().getArr();

        //btn0.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));

        btn0.setText(arr[0][0].isValue() ? "X" : "O");
        btn1.setText(arr[1][0].isValue() ? "X" : "O");
        btn2.setText(arr[2][0].isValue() ? "X" : "O");
        btn3.setText(arr[3][0].isValue() ? "X" : "O");

        btn4.setText(arr[0][1].isValue() ? "X" : "O");
        btn5.setText(arr[1][1].isValue() ? "X" : "O");
        btn6.setText(arr[2][1].isValue() ? "X" : "O");
        btn7.setText(arr[3][1].isValue() ? "X" : "O");

        btn8.setText(arr[0][2].isValue() ? "X" : "O");
        btn9.setText(arr[1][2].isValue() ? "X" : "O");
        btn10.setText(arr[2][2].isValue() ? "X" : "O");
        btn11.setText(arr[3][2].isValue() ? "X" : "O");

        btn12.setText(arr[0][3].isValue() ? "X" : "O");
        btn13.setText(arr[1][3].isValue() ? "X" : "O");
        btn14.setText(arr[2][3].isValue() ? "X" : "O");
        btn15.setText(arr[3][3].isValue() ? "X" : "O");
    }

    public void btnNewGame(ActionEvent actionEvent) {
        game = new Game();
        btnNewG.setDisable(true);
        btnResetG.setDisable(false);
        btnEndG.setDisable(false);
    }

    public void btnEndGame(ActionEvent actionEvent) {
        Stage stage = (Stage) btnEndG.getScene().getWindow();
        stage.close();
    }

    public void btnResetGame(ActionEvent actionEvent) {
        game = new Game();
        btnResetG.setDisable(true);
        btnNewG.setDisable(false);
        btnEndG.setDisable(false);
    }
}

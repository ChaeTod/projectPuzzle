package sample;

import binarytree.BinaryTreeNode;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Puzzle Game");
        primaryStage.setScene(new Scene(root, 523, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
/*
        BinaryTreeNode tree = new BinaryTreeNode(5);
        System.out.println("Building tree with root value ");
        tree.insert(tree, 2);
        tree.insert(tree, 4);
        tree.insert(tree, 8);
        tree.insert(tree, 6);
        tree.insert(tree, 7);
        tree.insert(tree, 3);
        tree.insert(tree, 9);
        System.out.println("Traversing tree in order");
        tree.traversePreOrder(tree);
*/
        launch(args);
    }
}

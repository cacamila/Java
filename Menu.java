import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class Menu extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane painel = new Pane();
        Scene cenario = new Scene(painel);
        primaryStage.setScene(cenario);
        primaryStage.show();

        Label id = new Label("ID: ");
        Label nome = new Label("Nome: ");
        Label telefone = new Label("Telefone: ");
        Button botao1 = new Button("Salvar");
        Button botao2 = new Button("Pesquisar");
        TextField textoid = new TextField(" ");
        TextField textonome = new TextField(" ");
        TextField textotelefone = new TextField(" ");


        //painel.getChildren().add(id);
        //painel.getChildren().add(nome);
        //painel.getChildren().add(telefone);
        painel.getChildren().addAll(id, nome, telefone, botao1, botao2, textoid,textonome,textotelefone);



        id.relocate(10,0);
        textoid.relocate(90,0);
        textoid.setPrefWidth(400);
        nome.relocate(10,30);
        textonome.relocate(90, 30);
        textonome.setPrefWidth(400);
        telefone.relocate(10,60);
        textotelefone.relocate(90, 60);
        textotelefone.setPrefWidth(400);
        botao1.relocate(10,90);
        botao2.relocate(60,90);


    }

    public static void main(String[] args) {
        Application.launch(Menu.class);
    }
}

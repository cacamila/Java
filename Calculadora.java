import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Calculadora extends Application {

    public void start(Stage stage) throws Exception{
        Pane painel = new Pane();
        Scene scn = new Scene(painel);
        stage.setScene(scn);
        stage.setTitle("Calculadora");
        stage.show();

        HBox linha1 = new HBox();
        HBox linha2 = new HBox();
        HBox linha3 = new HBox();
        HBox linha4 = new HBox();
        HBox linha5 = new HBox();

        TextField entrada = new TextField();
        Button ce = new Button(" CE ");
        Button um = new Button("    1    ");
        Button dois = new Button("    2    ");
        Button tres = new Button("    3    ");
        Button mais = new Button("  +  ");
        Button quatro = new Button("    4    ");
        Button cinco = new Button("    5    ");
        Button seis = new Button("    6    ");
        Button menos = new Button("  -  ");
        Button sete = new Button("    7    ");
        Button oito = new Button("    8    ");
        Button nove = new Button("    9    ");
        Button vezes = new Button("  *  ");
        Button virgula = new Button("    ,     ");
        Button zero = new Button("    0    ");
        Button igual = new Button("    =    ");
        Button barra = new Button("  /  ");


        painel.getChildren().addAll(entrada,ce,um, dois, tres,mais, quatro, cinco, seis,menos,
                sete, oito, nove,vezes,virgula,zero,igual,barra);

        //entrada.setPrefWidth(145);
        entrada.relocate(5,5);
        ce.relocate(155,5);
        um.relocate(5,35);
        dois.relocate(55,35);
        tres.relocate(105,35);
        mais.relocate(155,35);
        quatro.relocate(5,65);
        cinco.relocate(55,65);
        seis.relocate(105,65);
        menos.relocate(155,65);
        sete.relocate(5,95);
        oito.relocate(55,95);
        nove.relocate(105,95);
        vezes.relocate(155,95);
        virgula.relocate(5,125);
        zero.relocate(55,125);
        igual.relocate(105,125);
        barra.relocate(155,125);


    }

    public static void main(String[] args) {
        Application.launch(Calculadora.class);
    }

}

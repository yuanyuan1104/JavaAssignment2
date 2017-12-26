package q5;

import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;

/**
 * Class EmailPane.
 * <p>Sets the EmailPane.</p>
 *
 * @author Zhang Yuanyuan
 * @version 2017-10-29
 */
public class EmailPane extends GridPane {
    /**Declares constant for 0 index of grid.*/
    static final int GIRD_INDEX1 = 0;
    /**Declares constant for 0 index of grid.*/
    static final int GIRD_INDEX2 = 1;
    /**Declares constant for 0 index of grid.*/
    static final int GIRD_INDEX3 = 2;
    /**Declares constant for 0 index of grid.*/
    static final int GIRD_INDEX4 = 3;
    /**Declares constant for 0 index of grid.*/
    static final int GIRD_INDEX5 = 4;
    /**Declares constant for 0 index of grid.*/
    static final int GIRD_INDEX6 = 5;
    /**Declares constant for TextField width.*/
    static final int WIDTH = 200;
    /**Declares constant for TextField height.*/
    static final int HEIGHT = 100;
    /**
     * <p>
     * Constructs this pane with Label and TextField objects and a Button that 
     * holds the email content.
     * </p>
     */
    public EmailPane() {
          
        Label to = new Label("To: ");
        Label cc = new Label("Cc: ");
        Label bcc = new Label("Bcc: ");
        Label subject = new Label("Subject: ");
        Label message = new Label("Message: ");
        
        TextField to1 = new TextField();
        TextField cc1 = new TextField();
        TextField bcc1 = new TextField();
        TextField subject1 = new TextField();
        TextField message1 = new TextField();   
        Button send = new Button("Send");
        
        send.setOnAction((event) -> {
            System.out.println("To:" + to1.getText() + "\nCc: " + cc1.getText()
            + "\nBcc: " + bcc1.getText() + "\nSubject: " + subject1.getText()
            + "\nMessage: " + message1.getText());
        });
        
        setAlignment(Pos.CENTER);
        setStyle("-fx-background-color: pink");
        
        add(to, GIRD_INDEX1, GIRD_INDEX1);
        add(to1, GIRD_INDEX2, GIRD_INDEX1);
        add(cc, GIRD_INDEX1, GIRD_INDEX2);
        add(cc1, GIRD_INDEX2, GIRD_INDEX2);
        add(bcc, GIRD_INDEX1, GIRD_INDEX3);
        add(bcc1, GIRD_INDEX2, GIRD_INDEX3);
        add(subject, GIRD_INDEX1, GIRD_INDEX4);
        add(subject1, GIRD_INDEX2, GIRD_INDEX4);
        add(message, GIRD_INDEX1, GIRD_INDEX5);
        add(message1, GIRD_INDEX2, GIRD_INDEX5);
        add(send, GIRD_INDEX2, GIRD_INDEX6);
        
        message1.setPrefWidth(WIDTH);
        message1.setPrefHeight(HEIGHT);
    }
}

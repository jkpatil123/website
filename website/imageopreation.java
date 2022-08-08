import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;

public class imageopreation{
public static void main(String args[]){
    JFrame f = new JFrame();
    f.setTitle("Image opreation");
    f.setSize(400,400);
    f.setLocationRelativeTo(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Font font = new Font("Roboto " , Font.BOLD ,25);
    //create button
    JButton button = new JButton();
    button.setText("encrypt image");
    button.setFont(font);
   

    //creating text field
    JTextField textField =new JTextField(10);
    textField.setFont(font);

    //action 
    button.addActionListener(e->{
        System.out.println("button clicked");
       string text = textField.getText();
    });

    f.setLayout(new FlowLayout());
    f.add(button);
    f.add(textField);




    f.setVisible(true);
}

}
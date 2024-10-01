package newarch.model.random.panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello Folks");
    }

}

//
// PacMan
// Another 1 day game (created in 5 hours).
//
// (C)2000
// Brian Postma
// b.postma@hetnet.nl
// http://www.homepages.hetnet.nl/~brianpostma
//


import java.awt.EventQueue;
import javax.swing.JFrame;

public class PacMan extends JFrame {

  public PacMan() {

    initUI();
  }

  private void initUI() {

    add(new Board());

    setTitle("Pacman");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(380, 450);
    setLocationRelativeTo(null);
  }

  public static void main(String[] args) {

    EventQueue.invokeLater(() -> {
      PacMan ex = new PacMan();
      ex.setVisible(true);
    });
  }
}
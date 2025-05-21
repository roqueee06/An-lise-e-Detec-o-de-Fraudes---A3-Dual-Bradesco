package Interface;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PainelComImagem extends JPanel {
    private Image imagemFundo;

    public PainelComImagem(String caminhoImagem) {
        try {
            imagemFundo = new ImageIcon(getClass().getResource(caminhoImagem)).getImage();
        } catch (Exception e) {
            System.out.println("Imagem não encontrada: " + caminhoImagem);
        }
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagemFundo != null) {
            g.drawImage(imagemFundo, 0, 0, getWidth(), getHeight(), this);
        }
    }
}


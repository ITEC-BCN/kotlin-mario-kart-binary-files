
import main.model.CharacterMarioKart
import java.awt.Dimension
import java.awt.Image
import java.io.File
import java.nio.file.Paths
import javax.imageio.ImageIO
import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.SwingUtilities
import javax.swing.WindowConstants

/**
 * Vista creada amb Swing per tal de mostrar una finestra emergent amb la imatge del personatge
 */
object SwingImageView {
    fun mostrar(personatge: CharacterMarioKart) {
        SwingUtilities.invokeLater {
            val frame = JFrame(personatge.getName())
            frame.defaultCloseOperation = WindowConstants.DISPOSE_ON_CLOSE

            try {
                // Ruta absoluta a partir del directori del projecte
                val projectRoot = Paths.get("").toAbsolutePath().toString()
                val file = File(projectRoot, personatge.getPicture())

                //println("DEBUG: carregant imatge: ${file.absolutePath}, existeix? ${file.exists()}")

                val bufferedImage = ImageIO.read(file)
                    ?: throw RuntimeException("ImageIO.read ha retornat null per ${file.absolutePath}")

                val scaled = bufferedImage.getScaledInstance(300, 300, Image.SCALE_SMOOTH)
                val label = JLabel(ImageIcon(scaled))
                label.preferredSize = Dimension(300, 300)

                frame.contentPane.add(label)
                frame.pack()
                frame.setLocationRelativeTo(null)
                frame.isVisible = true

            } catch (e: Exception) {
                e.printStackTrace()
                val label = JLabel("No s'ha pogut carregar la imatge: ${personatge.getPicture()}")
                frame.contentPane.add(label)
                frame.pack()
                frame.setLocationRelativeTo(null)
                frame.isVisible = true
            }
        }
    }
}
package main.view

import main.model.CharacterMarioKart
import java.awt.Image
import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.JLabel

object SwingImageView {
    fun mostrar(personatge: CharacterMarioKart) {
        val frame = JFrame(personatge.getName())
        frame.defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE

        val icon = personatge.getImageIcon()
        val img = icon.image.getScaledInstance(300, 300, Image.SCALE_SMOOTH)

        val label = JLabel(ImageIcon(img))
        frame.add(label)

        frame.pack()
        frame.setLocationRelativeTo(null)
        frame.isVisible = true
    }
}
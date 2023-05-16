import java.awt.*
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

class FrameDefParser(frameFile: String) {
  private val frameDefPath = "src/main/resources/frameDefinitions/"
  private val file = File(frameDefPath + frameFile)
  private val bufferedReader = file.bufferedReader()
  val fileContents = bufferedReader.use { it.readText() }

  fun createImg() {
    val size = Dimension(360, 504)
    val img = BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB)

    val graphics = img.createGraphics()

    for (x in 0 until size.width) {
      for (y in 0 until size.height) {
        img.setRGB(x, y, 0x88aacc)
      }
    }

    graphics.font = Font("Arial", Font.BOLD, 16)
    graphics.color = Color.BLACK
    graphics.drawString("Test Text", 50, 50)

    val belerenFont =
        Font.createFont(Font.TRUETYPE_FONT, File("src/main/resources/fonts/Beleren2016-Bold.ttf"))
    graphics.font = belerenFont
      graphics.color = Color.WHITE

    graphics.drawString("Test Text", 50, 100)

    ImageIO.write(img, "BMP", File("output/test.bmp"))
  }
}

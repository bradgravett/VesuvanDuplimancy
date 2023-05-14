import java.awt.*
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

class FrameDefParser(frameFile: String) {
  private val frameDefPath = "src/main/kotlin/FrameDefinitions/"
  private val file = File(frameDefPath + frameFile)
  private val bufferedReader = file.bufferedReader()
  val fileContents = bufferedReader.use { it.readText() }

  fun createImg() {
    val size = Dimension(180, 252)
    val img = BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB)

    val graphics = img.createGraphics()
    val belerenFont =
        Font.createFont(Font.TRUETYPE_FONT, File("src/main/resources/fonts/Beleren2016-Bold.ttf"))

    graphics.font = Font("Arial", Font.BOLD, 16)
    graphics.color = Color.BLACK

    for (x in 0 until size.width) {
      for (y in 0 until size.height) {
        img.setRGB(x, y, 0xff0000)
      }
    }

    graphics.drawString("Test Text", 50, 50)

    ImageIO.write(img, "BMP", File("output/test.bmp"))
  }
}

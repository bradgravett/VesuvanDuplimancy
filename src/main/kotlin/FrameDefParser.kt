import java.io.File

class FrameDefParser(frameFilePath: String) {
  private val file = File(frameFilePath)
  private val bufferedReader = file.bufferedReader()
  val fileContents = bufferedReader.use { it.readText() }
}

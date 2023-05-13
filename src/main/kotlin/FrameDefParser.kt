import java.io.File

class FrameDefParser(frameFile: String) {
  private val frameDefPath = "src/main/kotlin/FrameDefinitions/"
  private val file = File(frameDefPath + frameFile)
  private val bufferedReader = file.bufferedReader()
  val fileContents = bufferedReader.use { it.readText() }
}

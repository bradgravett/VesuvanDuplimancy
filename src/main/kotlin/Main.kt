fun main() {

  val parser = FrameDefParser("prototypeFrame.txt")

  println(parser.fileContents)

  parser.createImg()
}

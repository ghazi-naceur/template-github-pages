
import org.scalajs.dom
import org.scalajs.dom.document

object Main {

  def main(args: Array[String]): Unit = {
    val message = "Hello, World!"
    val node = document.createElement("div")
    node.textContent = message
    document.body.appendChild(node)
  }
}

import scala.scalajs.js.annotation.JSExportTopLevel
import org.scalajs.dom
import org.scalajs.jquery._

/**
  * Sample Object. the |helloWorld()| method is callable from JS,
  * given that it includes a reference to sjs_tci_template-fastopt.js
  * which is compiled from this class by Scala.js
  *
  * In general: [ProjectRoot]/target/scala-2.12/[ProjectName]-fastopt.js
  *
  * Created by Dorian Thiessen on 2017-05-29.
  */
object Sample {

  @JSExportTopLevel("Sample.helloWorld") // Is not required to use the same name as the actual method
  def helloWorld(): Unit = {
    dom.console.log("helloWorld() called")
    jQuery("body").append(s"<h1>${getText()}</h1>")
  }

  // Logic with no JS dependencies
  def getText(): String = "Hello World!"

}

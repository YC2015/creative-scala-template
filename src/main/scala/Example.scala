import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DCanvas._
import doodle.backend.StandardInterpreter._
import doodle.core.Vec._

// To use this example, open the SBT console and type:
//
// Example.image.draw
object Example {
  val image = circle(10) on circle(20) on circle(30).fillColor(Color.red)
}

object Evileye {
  val innermost = (
    (circle(10)
    fillColor(Color.black))

    on

    (circle(20)
    fillColor(Color.rgb(0xad.uByte, 0xd8.uByte, 0xe6.uByte))
    lineWidth(5)
    lineColor(Color.black))

    on

    (circle(30)
    fillColor(Color.white)
    lineColor(Color.black)
    lineWidth(5))

    on

    (circle(40)
    fillColor(Color.darkBlue)
    lineColor(Color.black))
  )
}

object Tri {
    val tri1 = triangle(400, 100)
    val three = tri1 fillColor (Color.red) lineColor (Color.red.alpha(0.2 normalized)) lineWidth 5 beside
                tri1 fillColor (Color.red.spin(20.degrees)) lineColor (Color.red.spin(20.degrees).alpha(0.6 normalized)) lineWidth 5 below
                tri1 fillColor (Color.red.spin(30.degrees)) lineColor (Color.red.spin(30.degrees).alpha(0.6 normalized)) lineWidth 5
  }

object Bullseye{
  val stand = rectangle (25, 100) fillColor (Color.white) lineWidth 13
  val base = rectangle (100, 25) fillColor (Color.brown) lineColor (Color.black) lineWidth 7
  val grass = rectangle (400, 100) fillColor (Color.green) lineColor (Color.green)
  val firstCircle = circle(50) fillColor (Color.red) lineColor (Color.black) lineWidth 5
  val secondCircle = circle(100) fillColor (Color.white) lineColor (Color.black) lineWidth 5
  val thirdCircle = circle(150) fillColor (Color.red) lineColor (Color.black) lineWidth 5
  val allCircles = firstCircle on secondCircle on thirdCircle above stand above base above grass
}

Color.hsl(
  {
    0.degrees
    println("a")
    0.degrees
  },
  {
    1.normalized
    println("b")
    1.normalized
  },
  {
    1.normalized
    println("c")
    1.normalized
  }
)

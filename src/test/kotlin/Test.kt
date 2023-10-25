import org.junit.jupiter.api.Test
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.test.assertEquals

class Test {

    @Test
    fun testTriangle() {
        val a = 10.0
        val b = 10.0
        val c = 15.0
        val triangle = Triangle(a, b, c, "Black")
        val p = triangle.getPerimeter() / 2
        assertEquals(triangle.getPerimeter(), a + b + c)
        assertEquals(triangle.getArea(), sqrt(p * (p - a) * (p - b) * (p - c)))
    }

    @Test
    fun testCircle() {
        val r = 15.0
        val cirle = Circle(r, "Black")
        assertEquals(2 * Math.PI * r.pow(2.0), cirle.getArea())
        assertEquals(2 * Math.PI * r, cirle.getPerimeter())
    }

    @Test
    fun testSquare() {
        val a = 15.0
        val b = 23.0
        val square = Square(a, b, "Black")
        assertEquals(a * b, square.getArea())
        assertEquals(2 * a + 2 * b, square.getPerimeter())
    }
}


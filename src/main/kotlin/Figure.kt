import java.awt.Shape
import kotlin.math.sqrt

abstract class Figure(val color: String) {

    abstract fun getArea(): Double

    abstract fun getPerimeter(): Double

}

class Square(
    private val a: Double, private val b: Double, color: String
) : Figure(color) {


    override fun getArea(): Double {
        return a * b;
    }

    override fun getPerimeter(): Double {
        return 2 * (a + b);
    }

}

class Circle(private val r: Double, color: String) : Figure(color) {
    override fun getArea(): Double {
        return 2 * Math.PI * r * r
    }

    override fun getPerimeter(): Double {
        return 2 * Math.PI * r
    }

}

class Triangle(private val a: Double, private val b: Double, private val c: Double, color: String) : Figure(color) {
    override fun getArea(): Double {
        val p = getPerimeter() / 2;
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }

    override fun getPerimeter(): Double {
        return a + b + c
    }

}

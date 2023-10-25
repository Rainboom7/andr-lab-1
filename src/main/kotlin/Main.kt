fun main() {
    val figures: MutableList<Figure> = ArrayList<Figure>().toMutableList()
    figures += Square(10.0, 15.0, "Red")
    figures += Circle(10.0, "Red")
    figures += Triangle(10.0, 15.0, 20.0, "Black")

    var s: Double = 0.0;
    for (fig in figures) {
        s += fig.getArea()
    }
    println(s)

}

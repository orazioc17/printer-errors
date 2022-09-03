fun printerError(s: String): String {
    val baseString = "nopqrstuvwxyz"
    var counter = 0
    s.forEach { char -> if (char in baseString) counter++ }
    return "$counter/${s.length}"
}  

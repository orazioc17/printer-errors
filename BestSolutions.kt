fun printerError(s: String) = "${s.count { it !in 'a'..'m' }}/${s.length}"

fun printerError2(s: String): String {
  val errors = s.count { it !in 'a'..'m' }
  val length = s.length
  return "$errors/$length"
}  


fun invert(str: String) {
    var aux_str =""
    var str_size = str.length

    while (str_size>0){
        aux_str = aux_str + str[str_size-1]
        str_size--
    }

    println("$str was invert to: $aux_str")
}

fun main() {
    val str = readLine()
    val str1: String = str.toString()
    invert(str1)
}



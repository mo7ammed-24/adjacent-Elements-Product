fun main() {
    val myList= mutableListOf(1,-2,4,6,-1,0)
    println(adjacentElementsProduct(myList))
}

fun adjacentElementsProduct(inputArray: MutableList<Int>): Int {
    var max :Int= inputArray[0]*inputArray[1]
    var mult: Int
    for(i in 0 ..inputArray.size-2){
        mult=inputArray[i]*inputArray[i+1]
        if(mult>max)
            max=mult }

    return max }

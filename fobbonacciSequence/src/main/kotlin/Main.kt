fun main(){
    var counter = 0
    var fibbonacciSequence = arrayListOf(0,1)
    while(counter < 100){
        counter++
        var nexNumber = fibbonacciSequence[fibbonacciSequence.size-2] +fibbonacciSequence[fibbonacciSequence.size-1]

        fibbonacciSequence.add(nexNumber)


    }
    println(fibbonacciSequence)
}
fun main(args: Array<String>) {

    if (args.size != 3) {
        println("Invalid number of program arguments")
    } else {
        for (idx in args.indices) {
            args[idx] = args[idx].removeSuffix(",")
            println("Argument ${idx + 1}: ${args[idx]}. It has ${args[idx].length} characters")
        }
    }
}
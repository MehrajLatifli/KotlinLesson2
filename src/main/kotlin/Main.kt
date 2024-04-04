import java.util.Scanner

fun main() {


    // Task 1

    val scanner = Scanner(System.`in`)

    print("Enter name: ")
    val name = scanner.next()

    print("Enter surname: ")
    val surname = scanner.next()

    print("Enter age: ")
    var age: Int? = null
    while (age == null || age <= 0) {
        if (scanner.hasNextInt()) {
            age = scanner.nextInt()
            if (age <= 0) {
                println("\nPlease enter a valid age (positive integer).")
                print("Enter age: ")
            }
        } else {
            println("Please enter a valid age (positive integer).")
            print("Enter age: ")
            scanner.next()
        }
    }

    print("Enter height: ")
    var height: Double? = null
    while (height == null || height <= 0) {
        if (scanner.hasNextDouble()) {
            height = scanner.nextDouble()
            if (height <= 0) {
                println("\nPlease enter a valid height (positive number).")
                print("Enter height: ")
            }
        } else {
            println("Please enter a valid height (positive number).")
            print("Enter height: ")
            scanner.next()
        }
    }

    if (age is Int && height is Double) {
        println("$name $surname $age $height")
    }


    println("\n");

    // Task 2

    print("Calculate cycle (1 -> the area of the circle; 2 -> the length of the circumference):")
    val choose = scanner.nextInt()

    print("Enter radius:")
    val radius = scanner.nextDouble()

    when (choose) {
        1 -> {
            val area = 3.14 * (radius * radius)
            println(area)
        }

        2 -> {
            val length = 2 * 3.14 * radius

            println(length)
        }

        else -> {
            print("The fallacy of choice")
        }
    }


    println("\n");

    // Task 3

    while (true) {

        print("Calculate cycle (1 -> the area of the circle; 2 -> the length of the circumference):")

        val choose2 = scanner.nextInt()

        if (choose2 == 0) {
            break;
        } else {

            print("Enter radius:")
            val radius2 = scanner.nextDouble()

            when (choose2) {
                1 -> {
                    val area = 3.14 * (radius2 * radius2)
                    println(area)
                }

                2 -> {
                    val length = 2 * 3.14 * radius2

                    println(length)
                }

                else -> {
                    print("The fallacy of choice")
                }
            }
        }
    }


    println("\n");

    // Task 4

    while (true) {

        print("\nEnter number1: ")
        var number1: Double? = null
        while (number1 == null || number1 <= 0) {
            if (scanner.hasNextDouble()) {
                number1 = scanner.nextDouble()

            } else {
                println("\nPlease enter a valid number1")
                print("Enter number1: ")
                scanner.next()
            }
        }

        print("Enter number2: ")
        var number2: Double? = null
        while (number2 == null || number2 <= 0) {
            if (scanner.hasNextDouble()) {
                number2 = scanner.nextDouble()

            } else {
                println("\nPlease enter a valid number2")
                print("Enter number2: ")
                scanner.next()
            }
        }

        print("\n1 <- +  \n2 <- -  \n3 <- *  \n4 <- / \n\nCalculate operation : ")


        var choose4: Int? = null
        while (choose4 == null || choose4 <= 0) {
            if (scanner.hasNextInt()) {
                choose4 = scanner.nextInt()

            } else {
                println("\n" + "\n" + "Please enter a only integer")
                print("Calculate operation :  ")
                scanner.next()
            }
        }



        when (choose4) {
            1 -> {
                println(number1 + number2)
            }

            2 -> {
                println(number1 - number2)
            }

            3 -> {
                println(number1 * number2)
            }

            4 -> {
                println(number1 / number2)
            }

            else -> {
                print("\nThe fallacy of choice")
                break;
            }
        }
    }
}


fun main(){
    println(addition(arrayOf(1,2,3,4,5,6,7)))
        println(numbers(50,60))
        println(myName("esther naserian"))
        val inputArray = intArrayOf(5, 10, 3, 8, 7)
        val secondLargest = findSecondLargest(inputArray)
        println("Second Largest Number: \$secondLargest")
        println(myPalindrome("madam"))
        println(myPalindrome("naserian"))
    }
    //Write a function that takes an array of numbers as input and returns the sum of all the numbers
    fun addition (numbers: Array<Int>): Int{
        return numbers.sum()
    }
    //Write a function that takes two numbers as input and returns true if their sum is greater than 100,
    fun numbers(num1: Int,num2: Int): Boolean{
        val sum = num1 + num2
        if (sum >= 100)
            return (true)
        else return (false)
    }
    //Write a function that takes a string as input and returns the number of vowels in the string
    fun myName(name: String): Int{
        val vowels = listOf('a', 'e', 'i', 'o', 'u')
        var count = 0
        for (char in name.lowercase()) {
            if (char in vowels) {
                count++
            }
        }

        return count
    }
    //Write a function that takes in an array of numbers as a parameter and returns the second largest number in the array
    fun findSecondLargest(numbers: IntArray): Int {
        var largest = Int.MIN_VALUE
        var secondLargest = Int.MIN_VALUE
        for (num in numbers) {
            if (num > largest) {
                secondLargest = largest
                largest = num
            } else if (num > secondLargest && num != largest) {
                secondLargest = num
            }
        }
        return secondLargest
    }
    //Write a function that takes a string as a parameter and returns true if the string is a palindrome and false otherwise
    fun myPalindrome(name: String): String{
        if(name.reversed()==name) {
            return "is palindrome"
        }
        else {
            return  "not palindrome"
        }
    }


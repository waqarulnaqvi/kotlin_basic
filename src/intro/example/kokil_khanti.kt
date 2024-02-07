package intro.example

class kokil_khanti {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
//            Conditions statement in Kotlin
            var num = 150

            var msg = ""

            msg = if (num > 100) "No. is Greater than 100" else "No. is lesser than 100"
            println(msg)
        }
    }
}

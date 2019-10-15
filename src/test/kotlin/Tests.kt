import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test



class Tests {

    @Test
    fun `When number 1 is the input return "1 second"`() {
        assertEquals("1 second", formatTime(1))
    }

    @Test
    fun `When number 2 is the input return "2 seconds"`() {
        assertEquals("2 seconds", formatTime(2))
    }

    @Test
    fun `When number 2 is the input return "3 seconds"`() {
        assertEquals("3 seconds", formatTime(3))
    }

    @Test
    fun `When number 60 is the input return "1 minute"`() {
        assertEquals("1 minute", formatTime(60))
    }

    @Test
    fun `When number 61 is the input return "1 minute and 1 second"`() {
        assertEquals("1 minute and 1 second", formatTime(61))
    }


    private fun formatTime(i: Int): String {
        var outputString = ""
        if (i == 1) {
            outputString = "1 second"
        } else if (i in 2..59) {
            outputString = "$i seconds"
        } else if (i == 60) {
            outputString = "1 minute"
        }
        return outputString
    }


}
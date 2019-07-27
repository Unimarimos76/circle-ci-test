package com.example.myapplication

import org.junit.Test
import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun SampleTest001 () {
        var sample = Sample()
        assertEquals(10,sample.echo(10))
    }

    // OKケース２
    @Test
    fun SampleTest002 () {
        var sample = Sample()
        assertEquals(-15,sample.echo(-15))
    }

    // NGケース１
    @Test
    fun SampleTest100 () {
        var sample = Sample()
        assertNotEquals(10,sample.echo(20))
    }
}


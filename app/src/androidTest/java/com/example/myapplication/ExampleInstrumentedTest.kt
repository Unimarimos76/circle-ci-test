package com.example.myapplication

import androidx.test.InstrumentationRegistry
import androidx.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.example.myapplication", appContext.packageName)
    }
}

class SampleTest {

    // OKケース１
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

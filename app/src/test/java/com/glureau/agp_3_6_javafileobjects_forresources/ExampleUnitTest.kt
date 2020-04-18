package com.glureau.agp_3_6_javafileobjects_forresources

import com.google.testing.compile.JavaFileObjects
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun JavaFileObjects_forResources_is_working() {
        println(JavaFileObjects.forResource("FindMe.java"))
    }
}

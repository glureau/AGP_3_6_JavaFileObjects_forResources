# AGP 3.6.2 + JavaFileObjects.forResources(String)
Issue with JavaFileObjects.forResource(String) since upgrade from AGP 3.5 to 3.6

Run unit test from master => OK (the path is print on the standard output).

    com.google.testing.compile.JavaFileObjects$ResourceSourceJavaFileObject[file:/Users/greg/projects/AGP_3_6_JavaFileObjects_forResources/app/build/intermediates/sourceFolderJavaResources/debug/FindMe.java]

  
Switch your branch to **update_agp_to_version_3_6_2** (and use "Sync now" if testing from AndroidStudio):

    java.lang.IllegalArgumentException: resource FindMe.java not found.
        at com.google.common.base.Preconditions.checkArgument(Preconditions.java:217)
        at com.google.common.io.Resources.getResource(Resources.java:195)
        at com.google.testing.compile.JavaFileObjects.forResource(JavaFileObjects.java:161)
        at com.glureau.agp_3_6_javafileobjects_forresources.ExampleUnitTest.JavaFileObjects_forResources_is_working(ExampleUnitTest.kt:9)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
        at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
        at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
        at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
        at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
        at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
        at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
        at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
        at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
        at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
        at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
        at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
        at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
        at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
        at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)
        at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)
        at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)
        at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)


Related issue at Compile-Testing: https://github.com/google/compile-testing/issues/190

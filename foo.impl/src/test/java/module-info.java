

open module com.foo.impl {
    requires org.slf4j;
    requires org.slf4j.simple;
    requires com.foo.api;
    
    requires io.github.classgraph;

    requires org.junit.jupiter.api;
    requires org.junit.platform.commons;
    requires org.hamcrest;
}

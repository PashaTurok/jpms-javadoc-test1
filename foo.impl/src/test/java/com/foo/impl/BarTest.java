package com.foo.impl;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.Resource;
import io.github.classgraph.ScanResult;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

/**
 *
 * @author Pavel
 */
public class BarTest {
    
    private static final Logger logger = LoggerFactory.getLogger(BarTest.class);
    
    @Test
    void tempTest() {
        
        TestMe me = new TestMe();
        me.testMeNow();

        
    }
}

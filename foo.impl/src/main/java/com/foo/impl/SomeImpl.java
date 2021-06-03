
package com.foo.impl;

import com.foo.api.SomeInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SomeImpl javadoc.
 *
 * @author Pavel
 */
public class SomeImpl implements SomeInterface {
    
    private static final Logger logger = LoggerFactory.getLogger(SomeImpl.class);
    
    @Override
    public void doItNow() {
        logger.info("I am doing it....");
    }
}

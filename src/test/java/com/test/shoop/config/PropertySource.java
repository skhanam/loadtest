package com.test.shoop.config;

/**
 * Created by shabanakhanum on 9/15/16.
 */
public interface PropertySource {


        public abstract String getProperty(String propertyName);

        public abstract String getProperty(String propertyName, String defaultValue);


}

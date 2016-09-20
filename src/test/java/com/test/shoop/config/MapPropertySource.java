package com.test.shoop.config;

import java.util.Map;

/**
 * Created by shabanakhanum on 9/15/16.
 */
public class MapPropertySource implements  PropertySource {

        private Map<String, String> nameValues;


        public MapPropertySource(Map<String, String> nameValues) {
            this.nameValues = nameValues;
        }

        @Override
        public String getProperty(String propertyName) {
            return nameValues.get(propertyName);
        }

        @Override
        public String getProperty(String propertyName, String defaultValue) {
            String value = getProperty(propertyName);
            return value != null ? value : defaultValue;
        }
}


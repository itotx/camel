/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ehcache;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class EhcacheComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "configuration": ((EhcacheComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.ehcache.EhcacheConfiguration.class, value)); return true;
        case "cacheManager": ((EhcacheComponent) target).setCacheManager(property(camelContext, org.ehcache.CacheManager.class, value)); return true;
        case "cacheManagerConfiguration": ((EhcacheComponent) target).setCacheManagerConfiguration(property(camelContext, org.ehcache.config.Configuration.class, value)); return true;
        case "cacheConfiguration": ((EhcacheComponent) target).setCacheConfiguration(property(camelContext, org.ehcache.config.CacheConfiguration.class, value)); return true;
        case "cachesConfigurations": ((EhcacheComponent) target).setCachesConfigurations(property(camelContext, java.util.Map.class, value)); return true;
        case "cacheConfigurationUri": ((EhcacheComponent) target).setCacheConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((EhcacheComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((EhcacheComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((EhcacheComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "configuration": ((EhcacheComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.ehcache.EhcacheConfiguration.class, value)); return true;
        case "cachemanager": ((EhcacheComponent) target).setCacheManager(property(camelContext, org.ehcache.CacheManager.class, value)); return true;
        case "cachemanagerconfiguration": ((EhcacheComponent) target).setCacheManagerConfiguration(property(camelContext, org.ehcache.config.Configuration.class, value)); return true;
        case "cacheconfiguration": ((EhcacheComponent) target).setCacheConfiguration(property(camelContext, org.ehcache.config.CacheConfiguration.class, value)); return true;
        case "cachesconfigurations": ((EhcacheComponent) target).setCachesConfigurations(property(camelContext, java.util.Map.class, value)); return true;
        case "cacheconfigurationuri": ((EhcacheComponent) target).setCacheConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((EhcacheComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((EhcacheComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((EhcacheComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

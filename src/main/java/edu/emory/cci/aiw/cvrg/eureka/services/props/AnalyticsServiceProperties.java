package edu.emory.cci.aiw.cvrg.eureka.services.props;

import org.eurekaclinical.standardapis.props.CasJerseyEurekaClinicalProperties;

public class AnalyticsServiceProperties extends CasJerseyEurekaClinicalProperties {
    
    public AnalyticsServiceProperties() {
        super("/etc/ec-analytics-service");
    }
    
    @Override
    public String getProxyCallbackServer() {
        return getValue("eureka.services.callbackserver");
    }

    @Override
    public String getUrl() {
        return getValue("eureka.services.url");
    }
    
}
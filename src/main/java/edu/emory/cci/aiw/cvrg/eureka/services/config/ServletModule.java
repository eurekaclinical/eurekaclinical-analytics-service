package edu.emory.cci.aiw.cvrg.eureka.services.config;

import org.eurekaclinical.common.config.AbstractAuthorizingJerseyServletModuleWithPersist;
import edu.emory.cci.aiw.cvrg.eureka.services.filter.AutoAuthorizationFilter;
import edu.emory.cci.aiw.cvrg.eureka.services.props.AnalyticsServiceProperties;

public class ServletModule extends AbstractAuthorizingJerseyServletModuleWithPersist {

    private static final String PACKAGE_NAMES = "edu.emory.cci.aiw.cvrg.eureka.etl.resource";

    public ServletModule(AnalyticsServiceProperties inProperties) {
        super(inProperties, PACKAGE_NAMES, false);
    }

    
    @Override
    protected void setupFilters() {
        super.setupFilters();
        filter("/*").through(AutoAuthorizationFilter.class);
    }
}
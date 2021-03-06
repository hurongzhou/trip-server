package com.trip.common.dynamic;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDatasource extends AbstractRoutingDataSource{
    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDatasourceHolder.getDatasourceKey();
    }
}

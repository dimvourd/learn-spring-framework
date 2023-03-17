package com.spring.core.assgnment1.javaconfig;

import com.spring.core.assgnment1.DataSource;
import org.springframework.stereotype.Component;

public class PostgreSQLDataSource implements DataSource {
    String[] emailIDs;
    public PostgreSQLDataSource(){
        this.emailIDs = new String[]{"dka222,dkw444"};
    }


    @Override
    public String[] getEmails() {
        return emailIDs;
    }
}

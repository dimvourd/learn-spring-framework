package com.spring.core.assgnment1;

import org.springframework.stereotype.Component;

@Component("postgreSQLDataSource")
public class PostgreSQLDataSource implements DataSource{
    String[] emailIDs;
    public PostgreSQLDataSource(){
        this.emailIDs = new String[]{"dka222,dkw444"};
    }


    @Override
    public String[] getEmails() {
        return emailIDs;
    }
}

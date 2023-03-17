package com.spring.core.assgnment1;

import org.springframework.stereotype.Component;

@Component("mySQLDataSource")
public class MySQLDataSource implements DataSource{
    String[] emailIDs;
    public MySQLDataSource(){
        this.emailIDs = new String[]{"dka222,dkw444"};
    }

    @Override
    public String[] getEmails() {
        return emailIDs;
    }
}

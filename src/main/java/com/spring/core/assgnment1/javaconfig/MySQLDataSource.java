package com.spring.core.assgnment1.javaconfig;

import com.spring.core.assgnment1.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class MySQLDataSource implements DataSource {
    String[] emailIDs;

    public MySQLDataSource(){
        this.emailIDs = new String[]{"dka222,dkw444"};
    }

    @Override
    public String[] getEmails() {
        return emailIDs;
    }
}

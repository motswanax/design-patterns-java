package com.svs.dependencyInversionAndInjection;

interface DBConnectionInterface {
    int connect();
}

class MySqlConnection implements DBConnectionInterface {
    @Override
    public int connect() {
        return 0;
    }
}

public class PasswordReminder {
    private DBConnectionInterface dbConnection;

    public PasswordReminder(DBConnectionInterface dbConnection) {
        this.dbConnection = dbConnection;
    }
}

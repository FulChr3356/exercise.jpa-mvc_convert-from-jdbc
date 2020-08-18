package com.github.perscholas;

/**
 * Created by leon on 8/13/2020.
 */
public class MainApplication {
    public static void main(String[] args) {
        JdbcConfigurator configurator = new JdbcConfigurator(DatabaseConnection.PRODUCTION_DATABASE);
//        configurator.appendSqlScript("src/main/resources/person.create-table.sql");
//        configurator.appendSqlScript("src/main/resources/production.person_populate-table.sql");
        configurator.initialize();
        Runnable applicationRunner = new ApplicationRunner();
        applicationRunner.run();
    }
}

package com.james;


import com.james.view.CLI;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        CLI cli = new CLI();
        cli.run();


//        long start1 = System.nanoTime();
//
//      EmployeeStorageStarter.start();
//      EmployeeStorageServiceInterface employeeStorageServiceInterface = new EmployeeStorageService();
//      employeeStorageServiceInterface.getFromFactory();
//      DatabaseSetUp.setUpAndPopulateDB();

//      DAO dao = new DAO();
//      List<EmployeeDTO> dto = dao.findAll();
//      dto.forEach(System.out::println);
        // System.out.println(dto.size());
//      long end1 = System.nanoTime();
//        System.out.println("Time taken: " + (end1 - start1));
    }
}

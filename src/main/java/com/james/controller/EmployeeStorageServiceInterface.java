package com.james.controller;

import com.james.model.EmployeeDTO;


public interface EmployeeStorageServiceInterface {
  //Controller that mediates getting data and storing it
  void insertIntoList(EmployeeDTO item);

  void getFromFactory();

  int employeesWithNegativeSalary();

  int listOfDuplicateIDs();

  int employeesWithBadMiddleName();
}

package com.james.controller;

import com.james.model.storage.EmployeeStorage;

public interface EmployeeStorageStarter  {
  //Controller for starting the employee storage
 static EmployeeStorage start(){
    return EmployeeStorage.createEmployeeStorage();
  }
}

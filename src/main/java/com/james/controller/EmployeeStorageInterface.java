package com.james.controller;

import com.james.model.EmployeeDTO;

import java.util.HashMap;

public interface EmployeeStorageInterface {
  //Controller for storage specific methods
  void addCleanItem(EmployeeDTO item);
  void addUncleanItem(EmployeeDTO item);

  HashMap<Integer, EmployeeDTO> getCleanList();
  HashMap<Integer, EmployeeDTO> getUncleanList();


}

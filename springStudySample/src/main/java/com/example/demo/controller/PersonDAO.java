package com.example.demo.controller;

import java.io.Serializable;
import java.util.List;

public interface PersonDAO<T> extends Serializable {
  List<T> getAll();
}

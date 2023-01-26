package com.szczurek.rats.model;

import com.szczurek.rats.model.enums.RatSex;
import java.io.File;
import java.util.List;
import java.util.UUID;

public class Rat {

  private UUID id;
  private String name;
  private RatSex sex;
  private int monthsOld;
  private boolean castrated;
  private boolean pregnancyProbability;
}

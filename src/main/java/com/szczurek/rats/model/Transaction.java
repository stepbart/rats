package com.szczurek.rats.model;

import java.util.List;
import java.util.UUID;

public class Transaction {

  private UUID id;
  private boolean isFinished;
  private User giver;
  private User taker;
  private List<Rat> rats;

}

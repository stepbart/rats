package com.szczurek.rats.model;

import java.io.File;
import java.util.List;

public class Offer {

  private User offeror;
  private List<Rat> rats;
  private String reasonOfGiving;
  private boolean isSurveyRequired;
  private boolean isContractRequired;
  private boolean isVisitRequired;
  private boolean canBeSeparated;
  private Contact contact;
  private List<Photo> photos;
  private RatBehavior behavior;
  private String city;
  private TransportForm transport;

}

package com.company;

public interface ITelephone {
 void powerOn();
  void dial(int phoneNumber);
  void answer();
  boolean callphone(int phoneNumber);
  boolean isRinging();
}

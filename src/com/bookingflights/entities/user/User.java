package com.bookingflights.entities.user;

import java.util.Objects;

public class User {
  private String name;
  private String surname;

  public User() {
  }

  public User(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof User user)) return false;
    return Objects.equals(getName(), user.getName()) && Objects.equals(getSurname(), user.getSurname());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getSurname());
  }

  @Override
  public String toString() {
    return String.format("Name: %s, Surname: %s", this.getName(), this.getSurname());
  }
}

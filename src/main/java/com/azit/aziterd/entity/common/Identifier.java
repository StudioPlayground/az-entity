package com.azit.aziterd.entity.common;

public interface Identifier {
  Long id();

  default boolean isNull() {
    return this.id() == null;
  }
}

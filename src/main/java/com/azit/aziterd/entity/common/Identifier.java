package com.azit.aziterd.entity.common;

import java.io.Serializable;

public interface Identifier extends Serializable {
  Long id();

  default boolean isNull() {
    return this.id() == null;
  }
}

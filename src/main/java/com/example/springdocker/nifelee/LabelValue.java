package com.example.springdocker.nifelee;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
class LabelValue {

  private final String label;
  private final String value;

}

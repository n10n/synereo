package com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn; // Java Package generated by the BNF Converter.

public class QFal extends QryBool {

  public QFal() { }

  public <R,A> R accept(com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.QryBool.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.QFal) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}

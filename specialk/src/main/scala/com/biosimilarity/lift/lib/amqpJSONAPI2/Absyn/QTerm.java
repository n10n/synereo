package com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn; // Java Package generated by the BNF Converter.

public class QTerm extends QryTerm {
  public final String string_;
  public final QryArray qryarray_;

  public QTerm(String p1, QryArray p2) { string_ = p1; qryarray_ = p2; }

  public <R,A> R accept(com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.QryTerm.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.QTerm) {
      com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.QTerm x = (com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.QTerm)o;
      return this.string_.equals(x.string_) && this.qryarray_.equals(x.qryarray_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.string_.hashCode())+this.qryarray_.hashCode();
  }


}

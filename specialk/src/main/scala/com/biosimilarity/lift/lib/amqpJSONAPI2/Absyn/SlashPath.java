package com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn; // Java Package generated by the BNF Converter.

public class SlashPath extends URIRelativePath {
  public final URIRoot uriroot_;
  public final ListURIPathElement listuripathelement_;

  public SlashPath(URIRoot p1, ListURIPathElement p2) { uriroot_ = p1; listuripathelement_ = p2; }

  public <R,A> R accept(com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.URIRelativePath.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.SlashPath) {
      com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.SlashPath x = (com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.SlashPath)o;
      return this.uriroot_.equals(x.uriroot_) && this.listuripathelement_.equals(x.listuripathelement_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.uriroot_.hashCode())+this.listuripathelement_.hashCode();
  }


}

package com.biosimilarity.lift.lib.kvdbJSON.Absyn; // Java Package generated by the BNF Converter.

public class AtomDNSElement extends DNSElement {
  public final String lident_;

  public AtomDNSElement(String p1) { lident_ = p1; }

  public <R,A> R accept(com.biosimilarity.lift.lib.kvdbJSON.Absyn.DNSElement.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.lib.kvdbJSON.Absyn.AtomDNSElement) {
      com.biosimilarity.lift.lib.kvdbJSON.Absyn.AtomDNSElement x = (com.biosimilarity.lift.lib.kvdbJSON.Absyn.AtomDNSElement)o;
      return this.lident_.equals(x.lident_);
    }
    return false;
  }

  public int hashCode() {
    return this.lident_.hashCode();
  }


}

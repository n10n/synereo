package com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn; // Java Package generated by the BNF Converter.

public abstract class URIPathElement implements java.io.Serializable {
  public abstract <R,A> R accept(URIPathElement.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.AtomPathElement p, A arg);

  }

}

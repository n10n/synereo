package com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn; // Java Package generated by the BNF Converter.

public abstract class KVDBRequest implements java.io.Serializable {
  public abstract <R,A> R accept(KVDBRequest.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.KVDBAskReq p, A arg);
    public R visit(com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.KVDBTellReq p, A arg);
    public R visit(com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.KVDBNoReq p, A arg);

  }

}

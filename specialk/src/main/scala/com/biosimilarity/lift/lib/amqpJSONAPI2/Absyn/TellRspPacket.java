package com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn; // Java Package generated by the BNF Converter.

public abstract class TellRspPacket implements java.io.Serializable {
  public abstract <R,A> R accept(TellRspPacket.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.KVDBTellRspData p, A arg);

  }

}

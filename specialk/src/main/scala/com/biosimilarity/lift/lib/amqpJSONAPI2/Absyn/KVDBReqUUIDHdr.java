package com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn; // Java Package generated by the BNF Converter.

public class KVDBReqUUIDHdr extends ReqHeader {
  public final UUID uuid_;

  public KVDBReqUUIDHdr(UUID p1) { uuid_ = p1; }

  public <R,A> R accept(com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.ReqHeader.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.KVDBReqUUIDHdr) {
      com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.KVDBReqUUIDHdr x = (com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.KVDBReqUUIDHdr)o;
      return this.uuid_.equals(x.uuid_);
    }
    return false;
  }

  public int hashCode() {
    return this.uuid_.hashCode();
  }


}

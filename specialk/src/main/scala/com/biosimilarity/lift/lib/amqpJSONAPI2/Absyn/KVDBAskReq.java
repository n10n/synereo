package com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn; // Java Package generated by the BNF Converter.

public class KVDBAskReq extends KVDBRequest {
  public final AskReq askreq_;
  public final AskReqPacket askreqpacket_;

  public KVDBAskReq(AskReq p1, AskReqPacket p2) { askreq_ = p1; askreqpacket_ = p2; }

  public <R,A> R accept(com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.KVDBRequest.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.KVDBAskReq) {
      com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.KVDBAskReq x = (com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.KVDBAskReq)o;
      return this.askreq_.equals(x.askreq_) && this.askreqpacket_.equals(x.askreqpacket_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.askreq_.hashCode())+this.askreqpacket_.hashCode();
  }


}

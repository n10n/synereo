// -*- mode: Scala;-*- 
// Filename:    BFactoryDefaultService.scala 
// Authors:     lgm                                                    
// Creation:    Thu Nov 21 10:32:00 2013 
// Copyright:   Not supplied 
// Description: 
// ------------------------------------------------------------------------

package com.biosimilarity.evaluator.distribution

import com.protegra_ati.agentservices.store._
import com.biosimilarity.evaluator.msgs._
import com.biosimilarity.lift.model.store._
import com.biosimilarity.lift.lib._

import org.json4s._
import org.json4s.native.JsonMethods._
import org.json4s.JsonDSL._

import scala.concurrent.duration._
import scala.util.continuations._ 
import scala.collection.mutable.HashMap

import com.typesafe.config._

import java.net.URI
import java.util.Date
import java.util.UUID

package bfactory {
  trait StartMeUpT {
    def run(
      b : Boolean, i : Int, s : String, r : Option[StartMeUp]
    ) = {
      println(
        (
          "b : " + b
          + "\n i : " + i
          + "\n s : " + s
          + "\n r : " + r
        )
      )
    }
  }
  class StartMeUp(
  ) extends StartMeUpT {
    override def run(
      b : Boolean, i : Int, s : String, r : Option[StartMeUp]
    ) = {
      super.run( b, i , s, r )
    }
  }
  object BFactoryDefaultServiceContext
  extends Serializable {    
    import CnxnConversionStringScope._
    import com.protegra_ati.agentservices.store.extensions.StringExtensions._
    @transient
    lazy val storageLabels =
      new CnxnString[String,String,String] with Serializable { }
    @transient
    lazy val eServe =
      new BFactoryCommsService
         with EvalConfig
         with BFactoryCommLinkConfiguration
         with Serializable {
         }    
    @transient
    lazy val introductionInitiatorCnxn =
      new PortableAgentCnxn(
        "introductionCnxn".toURI,
        "initiation",
        "introductionCnxn".toURI
      )
    @transient
    lazy val introductionRecipientCnxn =
      new PortableAgentCnxn(
        "introductionCnxn".toURI,
        "receipt",
        "introductionCnxn".toURI
      )
    @transient
    lazy val introductionInitiatorLabel =
      storageLabels.fromTermString(
        "behaviors( introduction( initiator( true ), Alias ) )"
      ).getOrElse( throw new Exception( "unable to parse label" ) )

    @transient
    lazy val introductionRecipientLabel =
      storageLabels.fromTermString(
        "behaviors( introduction( recipient( true ), Cnxn ) )"
      ).getOrElse( throw new Exception( "unable to parse label" ) )
      
    @transient
    lazy val verifierProtocolCnxn = new PortableAgentCnxn(
      "verifierProtocol".toURI,
      "verifierProtocol",
      "verifierProtocol".toURI
    )
    
    @transient lazy val claimantLabel = storageLabels.fromTermString("claimant(true)").get
    @transient lazy val verifierLabel = storageLabels.fromTermString("verifier(true)").get
    @transient lazy val relyingPartyLabel = storageLabels.fromTermString("relyingParty(true)").get

    @transient
    lazy val omniProtocolCnxn = new PortableAgentCnxn(
      "omniProtocol".toURI,
      "omniProtocol",
      "omniProtocol".toURI
    )
    @transient lazy val omniLabel = storageLabels.fromTermString("omni(true)").get
    @transient
    lazy val omniReadCnxn = PortableAgentCnxn(new URI("ui://glosevalOmni"), "alias", new URI("ui://omniGloseval"))
    @transient
    lazy val omniWriteCnxn = PortableAgentCnxn(new URI("ui://glosevalOmni"), "alias", new URI("ui://omniGloseval"))
  }
}

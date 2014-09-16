package me.rerun.akkanotes.messaging

import akka.actor.ActorSystem
import akka.actor.Props
import TeacherProtocol._

/**
 * Let's have the student as a simple runnable App now instead of an Actor for the first part.
 * 
 * There's a test class which actually does the same thing as this App
 * 
 */

object StudentApp extends App{

  val actorSystem=ActorSystem("QuoteSystem")
  val teacherActorRef=actorSystem.actorOf(Props[Teacher])
  
  teacherActorRef!QuoteRequest
  
  actorSystem.shutdown()
  
}
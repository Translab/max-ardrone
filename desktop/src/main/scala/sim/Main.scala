package com.fishuyo
package drone
package sim

import maths._
import graphics._
import spatial._
import io._
import dynamic._
import audio._

import com.fishuyo.SimpleAppRun

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.InputAdapter
import com.badlogic.gdx.graphics.glutils._
//import com.badlogic.gdx.graphics.GL10

object Main extends App{

  SimpleAppRun.loadLibs()

  var drone = new ARDroneSim
  GLScene.push( drone )

  var ground = GLPrimitive.cube(Pose(), Vec3(.1f,.1f,.1f))
  GLScene.push(ground)


  val live = new Ruby("src/main/scala/sim/live.rb")

  Trackpad.connect()

  SimpleAppRun()  

}




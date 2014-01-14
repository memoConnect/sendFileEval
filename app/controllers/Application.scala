package controllers

import play.api._
import play.api.mvc._
import java.io.File

object Application extends Controller {

  def index = Action {
    Ok("moin")
  }

  def sendFile = Action(parse.temporaryFile) {
    request => {

      val file: File = new File("/tmp/test")

      request.body.copy(file)

      Ok("ok")
    }
  }

}
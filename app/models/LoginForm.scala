package models

object LoginForm {
  import play.api.data.Forms._
  import play.api.data.Form


  case class Data(username: String, password :String)

  val form = Form(
    mapping(
      "username" -> text,
      "password" -> text
    )(Data.apply)(Data.unapply)
  )
}

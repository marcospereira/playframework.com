package controllers

import javax.inject.Inject

import play.api.mvc.{ AbstractController, ControllerComponents }

/**
 * The outreachy controller
 */
class Outreachy @Inject() (components: ControllerComponents) extends AbstractController(components) {

  def outreachy = Action(Redirect(routes.Outreachy.round11()))

  def round10 = Action { implicit req =>
    Ok(views.html.outreachy.round10())
  }

  def round11 = Action { implicit req =>
    Ok(views.html.outreachy.round11())
  }
}

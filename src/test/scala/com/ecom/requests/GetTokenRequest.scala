package com.ecom.requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import com.ecom.config.Config.appUrl

object GetTokenRequest {
  print("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< URL TUT >>>>>>>>>>>" + appUrl)
  val httpProtocol = http
    .baseUrl(appUrl)
  val get_token = http("GetAuthCode")
    .get("/api/auth/generate_token")
//    .check(status is 200)
//    .check(jsonPath("$..token").saveAs("token"))
  print("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< 222 2222 URL TUT >>>>>>>>>>>" + get_token)
}

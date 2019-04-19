package com.ecom.requests

import com.ecom.config.Config.appUrl
import io.gatling.core.Predef._
import io.gatling.http.Predef._


object ValidateToken {
  val validateToken = http("ValidateToken").get(appUrl + s"/api/auth/validate_token/" + "${token}")
    .check(status is 200)
    .check(regex("ok").exists)
}

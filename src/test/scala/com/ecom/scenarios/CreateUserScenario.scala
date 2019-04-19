package com.ecom.scenarios

import com.ecom.requests.{GetTokenRequest, ValidateToken}
import io.gatling.core.Predef.scenario

object CreateUserScenario {
  print("<<<<<<<<<<<<ALO ALO ALO >>>>>>>>>>>>>>" + GetTokenRequest.get_token)
  val createUserScenario = scenario("Create User Scenario")
    .exec(GetTokenRequest.get_token)
    .exec(ValidateToken.validateToken)
}

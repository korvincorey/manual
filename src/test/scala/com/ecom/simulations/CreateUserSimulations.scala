package com.ecom.simulations

import com.ecom.scenarios.CreateUserScenario
import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef._
import com.ecom.config.Config._

class CreateUserSimulations extends Simulation{
  private val createUserExec = CreateUserScenario.createUserScenario
    .inject(atOnceUsers(users))

  setUp(createUserExec)
}

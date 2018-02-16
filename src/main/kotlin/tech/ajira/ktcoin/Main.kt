package tech.ajira.ktcoin

import io.javalin.Javalin
import tech.ajira.ktcoin.models.Block
import tech.ajira.ktcoin.models.BlockChain
import tech.ajira.ktcoin.models.Transaction

fun main(args: Array<String>) {
  val app = Javalin.start(System.getenv("PORT").toInt())
  app.get("/") { ctx -> ctx.result("Ktcoin - A Blockchain demo") }

  app.get("/mine") { ctx ->
    ctx.result("Yet to be implemented")
  }

  app.post("/transactions") { ctx ->
    ctx.result("Yet to be implemented")
  }

  app.post("/blocks") { ctx ->
    ctx.result("Yet to be implemented")
  }

  app.get("/blocks") { ctx ->
    ctx.result("Yet to be implemented")
  }

  app.post("/blocks/resolve") { ctx ->
    ctx.result("Yet to be implemented")
  }

  app.get("/blocks/:id") { ctx ->
    ctx.result("Yet to be implemented")
  }

  app.post("/nodes") { ctx ->
    ctx.result("Yet to be implemented")
  }

}
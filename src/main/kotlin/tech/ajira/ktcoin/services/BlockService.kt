package tech.ajira.ktcoin.services

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.fuel.httpPost
import tech.ajira.ktcoin.models.Block

object BlockService {
  fun broadcastNewBlock(nodeAddresses: Set<String>, newBlock: Block) {

  }

  fun fetchChain(nodeAddress: String, callback: (ArrayList<Block>) -> Unit) {

  }
}
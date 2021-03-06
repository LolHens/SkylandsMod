package org.lolhens.skylands.proxy

import java.io.File

import org.lolhens.skylands.{Skylands, SkylandsClient}

/**
  * Created by pierr on 02.01.2017.
  */
class ClientProxy extends CommonProxy {
  override def skylands(configFile: File): Skylands = new SkylandsClient(configFile)
}

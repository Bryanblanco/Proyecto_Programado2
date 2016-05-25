
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/usuario/Desktop/apkBryam/conf/routes
// @DATE:Tue May 24 18:52:22 CST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}

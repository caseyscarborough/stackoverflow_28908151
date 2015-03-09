package stackoverflow_28908151

abstract class BaseController<T> {

  private final Class<T> clazz

  BaseController() {}

  BaseController(Class<T> clazz) {
    this.clazz = clazz
  }

  def index(Integer max) {
    log.info("Inside BaseController#index")
    params.max = Math.min(max ?: 10, 100)
    respond clazz.list(params), model:[instanceCount: clazz.count()]
  }

  def show(Long id) {
    log.info("Inside BaseController#show")
    def instance = clazz.get(id)
    respond instance
  }
}

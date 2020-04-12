package mm.com.bandsevent.baseInterface

interface BaseView<T : BasePresenter> {

    interface View : ContextRetriever, RootViewRetriever, ErrorsView

    fun setPresenter(presenter: T)
}
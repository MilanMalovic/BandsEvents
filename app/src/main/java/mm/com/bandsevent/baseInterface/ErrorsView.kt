package mm.com.bandsevent.baseInterface

interface ErrorsView {
    fun showUnexpectedError(error: Throwable)
    fun showBackendGeneratedError(errors: ArrayList<String>)
}
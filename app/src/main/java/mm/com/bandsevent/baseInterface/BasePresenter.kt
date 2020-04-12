package mm.com.bandsevent.baseInterface

import io.reactivex.disposables.CompositeDisposable

interface BasePresenter {

    fun subscribe()

    fun unsubscribe()

    fun disposable(): CompositeDisposable

}
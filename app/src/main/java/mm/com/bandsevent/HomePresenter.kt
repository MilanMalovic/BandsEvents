package mm.com.bandsevent

import io.reactivex.disposables.CompositeDisposable
import mm.com.bandsevent.repository.ArtistRepositoryInit
import mm.com.bandsevent.repository.ArtistRepositoryProvider

class HomePresenter(private val view: HomeView.View) : HomeView.Presenter {

    private val disposable = CompositeDisposable()

    override fun subscribe() {
    }

    override fun unsubscribe() {
        if (disposable.isDisposed) {
            disposable.clear()
        }
    }

    override fun disposable(): CompositeDisposable = disposable


    override fun getArtistByName(artist: String, options: Map<String?, String?>) {
        disposable.add(ArtistRepositoryProvider.provideArtistRepository()
            .getArtistByName(artist, options)
            .subscribe {
                view.notifyArtistAdded()
            }

        )
    }
}
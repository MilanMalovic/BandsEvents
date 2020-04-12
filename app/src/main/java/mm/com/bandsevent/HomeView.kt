package mm.com.bandsevent

import mm.com.bandsevent.baseInterface.BasePresenter
import mm.com.bandsevent.baseInterface.BaseView
import mm.com.bandsevent.baseInterface.LoadingView

interface HomeView {

    interface View : BaseView<Presenter>, BaseView.View, LoadingView {
        fun notifyArtistAdded()
    }

    interface Presenter : BasePresenter {
        fun getArtistByName(artist:String, options: Map<String?, String?>)
    }

}
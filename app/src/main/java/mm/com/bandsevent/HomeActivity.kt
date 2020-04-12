package mm.com.bandsevent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import mm.com.bandsevent.HomeView.Presenter

class HomeActivity: AppCompatActivity(),  HomeView.View {


    private lateinit var presenter: HomeView.Presenter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        initPresenter()
    }

    override fun notifyArtistAdded() {
        TODO("Not yet implemented")
    }

    override fun setPresenter(presenter: Presenter) {
        this.presenter = presenter
    }

    private fun initPresenter() {
        setPresenter(HomePresenter(this))
    }

    override fun showUnexpectedError(error: Throwable) {
        TODO("Not yet implemented")
    }

    override fun showBackendGeneratedError(errors: ArrayList<String>) {
        TODO("Not yet implemented")
    }

    override fun showLoading() {
        TODO("Not yet implemented")
    }

    override fun hideLoading() {
        TODO("Not yet implemented")
    }
}
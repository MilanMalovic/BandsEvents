package mm.com.bandsevent.network

import io.reactivex.Completable
import io.reactivex.Observable
import mm.com.bandsevent.network.dataModel.Example
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface ApiService {

    @GET("artists/{artist}/events")
    fun getArtistByName(
        @Path("artist") artist: String?,
        @QueryMap options: Map<String?, String?>
    ): Observable<List<Example>>
}
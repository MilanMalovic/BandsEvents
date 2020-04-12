package mm.com.bandsevent.repository

import io.reactivex.Completable
import io.reactivex.Observable
import mm.com.bandsevent.network.dataModel.Example

interface ArtistRepository {

    fun getArtistByName(artist: String, options: Map<String?, String?>): Observable<List<Example>>
}
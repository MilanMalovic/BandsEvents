package mm.com.bandsevent.repository

import io.reactivex.Completable
import io.reactivex.Observable
import kotlinx.serialization.StructureKind.MAP
import mm.com.bandsevent.apiUtils.RxUtils
import mm.com.bandsevent.network.ApiFactory
import mm.com.bandsevent.network.dataModel.Example

class ArtistRepositoryInit : ArtistRepository {
    override fun getArtistByName(artist: String, options: Map<String?, String?>): Observable<List<Example>> {
        return ApiFactory.create()
            .getArtistByName(artist, options)
            .compose(RxUtils.async())
    }
}
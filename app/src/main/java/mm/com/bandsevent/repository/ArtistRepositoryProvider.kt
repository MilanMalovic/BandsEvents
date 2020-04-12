package mm.com.bandsevent.repository

object ArtistRepositoryProvider {

    private lateinit var artistRepository: ArtistRepository

    fun provideArtistRepository(): ArtistRepository {
        if (!this::artistRepository.isInitialized) {
            artistRepository = ArtistRepositoryInit()
        }
        return artistRepository
    }
}
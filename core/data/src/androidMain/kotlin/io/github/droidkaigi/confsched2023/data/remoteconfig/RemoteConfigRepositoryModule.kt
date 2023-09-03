package io.github.droidkaigi.confsched2023.data.remoteconfig

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.droidkaigi.confsched2023.data.achivements.AchievementsDataStore
import io.github.droidkaigi.confsched2023.data.contributors.StampRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteConfigRepositoryModule {
    @Provides
    @Singleton
    fun provideRemoteConfigRepository(
        remoteConfigApi: RemoteConfigApi,
        achievementsDataStore: AchievementsDataStore,
    ): StampRepository {
        return DefaultStampRepository(
            remoteConfigApi = remoteConfigApi,
            achievementsDataStore = achievementsDataStore,
        )
    }
}

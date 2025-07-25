package org.contoso.netflix.playlist.port.output;

import org.contoso.netflix.playlist.domain.entity.Playlist;

import java.util.List;
import java.util.Optional;

public interface PlaylistRepository {
    List<Playlist> findPlaylistsByUserId(String userId);

    Optional<Playlist> findPlaylistsByUserIdAndId(String userId, String playlistId);

    List<Playlist> findSystemPlaylistsByUserId(String userId);

    Playlist removeMovieFromPlaylist(String userId, String playlistId, String movieId);

    Playlist addMovieToPlaylist(String userId, String playlistId, String movieId);

    Playlist save(Playlist newPlaylist);
}

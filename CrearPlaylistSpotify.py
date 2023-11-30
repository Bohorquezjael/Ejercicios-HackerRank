import spotipy
from spotipy.oauth2 import SpotifyOAuth

# Configuración de credenciales y autenticación
sp = spotipy.Spotify(auth_manager=SpotifyOAuth(client_id='576003f539044218a0fa95fdfb2ded8c',
                                               client_secret='93cfc06e467e4e42987eff4beb7d18ba',
                                               redirect_uri='http://localhost:3000/callback',
                                               scope='playlist-modify-public'))

# Obtener canciones "Me gusta"
liked_songs = sp.current_user_saved_tracks()

# Crear una nueva playlist
playlist = sp.user_playlist_create(user='wlesofyj84y7no88bjke78rhl', name='Me gusta', public=True)

# Agregar canciones a la nueva playlist
tracks = [track['track']['uri'] for track in liked_songs['items']]
sp.playlist_add_items(playlist_id=playlist['id'], items=tracks)

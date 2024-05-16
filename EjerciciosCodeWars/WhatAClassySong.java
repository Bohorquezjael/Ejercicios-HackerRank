import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class WhatAClassySong{
  private String title;
  private String artist;
  private Set<String> listeners = new HashSet<String>();
  
  public WhatAClassySong(String title, String artist){
    this.title = title;
    this.artist = artist;
  }
  
  public String getTitle(){
    return this.title;
  }
  
  public String getArtist(){
    return this.artist;
  }
  
  public int howMany(ArrayList<String> persons){
    int listenersOld = listeners.size();
    persons.forEach(listener -> listeners.add(listener.toLowerCase()));
    return listeners.size() - listenersOld;
  }
}
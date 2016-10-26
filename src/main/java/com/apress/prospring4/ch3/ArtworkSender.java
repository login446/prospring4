package com.apress.prospring4.ch3;

/**
 * Created by admin on 28.09.2016.
 */
public interface ArtworkSender {
    void sendArtwork(String artworkPath, Recipient recipient);
    String getFriendlyName();
    String getShortName();
}

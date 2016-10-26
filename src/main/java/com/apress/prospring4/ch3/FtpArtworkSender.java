package com.apress.prospring4.ch3;

/**
 * Created by admin on 28.09.2016.
 */
public class FtpArtworkSender implements ArtworkSender {
    @Override
    public void sendArtwork(String artworkPath, Recipient recipient) {

    }

    @Override
    public String getFriendlyName() {
        return "File Transfer Protocol";
    }

    @Override
    public String getShortName() {
        return "ftp";
    }
}

package com.xworkz.remote;

import com.xworkz.remote.universalremote.UniversalRemote;

public class RemoteRunner {
    public static void main(String[] args) {
        UniversalRemote universalRemote = new UniversalRemote();
        universalRemote.brand();
        universalRemote.type();
        universalRemote.powerSource();

        Remote remote = new Remote();
        remote.brand();
        remote.type();
        remote.powerSource();
    }
}

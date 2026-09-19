# SpotX Android - Termux Runtime Edition

Termux control plane plus an Android runtime module.

Quick start:

    pkg update
    pkg install git bash coreutils python
    git clone https://github.com/tubagusbangsawan/SPotX-Android.git
    cd SPotX-Android
    bash bin/install-termux.sh
    spotx doctor

Termux alone cannot inject code into another application's process on a stock, non-root Android installation. This project does not implement Premium/account authorization bypass or server-side entitlement spoofing.

The spotx patch command records runtime configuration and does not rewrite the Spotify APK.

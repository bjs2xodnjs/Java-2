package control.legacy;

import control.GenelecWoofer;
import control.Speaker;
import control.Woofer;

public class HarmanSpeaker implements Speaker {

    private Woofer woofer;

    public HarmanSpeaker() {
       this.woofer = new GenelecWoofer(); //객체생성
    }

    @Override
    public void speakerSound() {
        System.out.println("HarmanSpeaker: 소리가 맑아요." );
        woofer.baseSound();
    }
}

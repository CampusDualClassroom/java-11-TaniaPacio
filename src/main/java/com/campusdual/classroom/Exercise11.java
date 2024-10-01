package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());


        TVRemote ejercicioTv = new TVRemote("Black");

        ejercicioTv.turnOn();

        ejercicioTv.channelUp();
        System.out.println("Channel actual: " + ejercicioTv.channel);

        ejercicioTv.channelDown();
        System.out.println("Channel actual: " + ejercicioTv.channel);

        ejercicioTv.channelDown();
        System.out.println("Channel actual: " + ejercicioTv.channel);

        ejercicioTv.volumeUp();
        System.out.println("Volumen actual: " + ejercicioTv.volume);

        ejercicioTv.volumeDown();
        System.out.println("Volumen actual: " + ejercicioTv.volume);

        while(ejercicioTv.volume > 0){
            ejercicioTv.volumeDown();
        }
        ejercicioTv.volumeDown();
        System.out.println("Volumen actual: " + ejercicioTv.volume);

        System.out.println("Color actual: " + ejercicioTv.getColor());

        ejercicioTv.turnOff();

    }

}
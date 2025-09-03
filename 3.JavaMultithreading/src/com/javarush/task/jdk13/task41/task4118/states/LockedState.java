package com.javarush.task.jdk13.task41.task4118.states;

import com.javarush.task.jdk13.task41.task4118.ui.Player;

public class LockedState extends State {

    public LockedState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        if (player.isPlaying()) {
            player.setPlaying(false);
            player.setState(new PlayingState(player));
            return "Stop playing";
        } else {
            return "Locked...";
        }
    }

    @Override
    public String onPlay() {
        player.setState(new ReadyState(player));
        return "";
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }


}

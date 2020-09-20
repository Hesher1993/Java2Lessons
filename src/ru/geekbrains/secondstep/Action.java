package ru.geekbrains.secondstep;

public interface Action {
    void run();

    void jump();

    int getRunDistance();

    int getJumpHeight();
}

package ru;

import org.springframework.stereotype.Component;
import ru.Music;


@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
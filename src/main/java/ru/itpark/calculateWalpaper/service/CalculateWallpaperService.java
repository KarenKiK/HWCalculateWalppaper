package ru.itpark.calculateWalpaper.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateWallpaperService {
    public double calculate (int isLong, int with, int height, double withWallpaperInM, int isLongWallpaperInM){
        int perimeter = isLong + isLong + with + with;
        double clothNumber = (int) (perimeter / withWallpaperInM) + 1;
        double stripNumberWallpaper = (int) (isLongWallpaperInM / height);
        int rolls = (int) (clothNumber / stripNumberWallpaper + 1);
        return rolls;
    }
}

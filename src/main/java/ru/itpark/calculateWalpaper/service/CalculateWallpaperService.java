package ru.itpark.calculateWalpaper.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateWallpaperService {
    public double calculate (int isLong, int with, int height, double withWallpaperInM, int isLongWallpaperInM){
// Islong - Длина комнаты (room length), With - Ширина комнаты (with room), Height - высота комнаты (height room)
// WithWallpaperInM - Ширина обоев измеряется в метрах, IsLongWallpaperInM - Длинна рулона обоев изеряется в метрах

        int perimeter = isLong + isLong + with + with;
        double clothNumber = (int) (perimeter / withWallpaperInM) + 1;
// ClothNumber - количество полос обоев, нужное для проклейки всей комнаты
        double stripNumberWallpaper = (int) (isLongWallpaperInM / height);
// StripNumberWallpaper - количество целых полос с одного рулона
        int rolls = (int) (clothNumber / stripNumberWallpaper + 1);
// Rolls - рулоны обоев, нужные для проклейки комнаты
        return rolls;
    }
}

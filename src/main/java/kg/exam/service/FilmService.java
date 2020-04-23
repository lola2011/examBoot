package kg.exam.service;

import kg.exam.entity.Film;

import java.util.List;

public interface FilmService {
    Film create (Film film);
    List<Film> getAll();
}

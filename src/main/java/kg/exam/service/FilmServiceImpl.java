package kg.exam.service;

import kg.exam.entity.Film;
import kg.exam.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    private FilmRepository filmRepository;
    @Override
    public Film create(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public List<Film> getAll() {
        return filmRepository.findAll();
    }
}

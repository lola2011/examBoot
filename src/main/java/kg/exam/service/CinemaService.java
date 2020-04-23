package kg.exam.service;

import kg.exam.entity.Cinema;

public interface CinemaService {
    Cinema create(Cinema cinema);
    Cinema getById(Long id);
}

package kg.exam.service;

import kg.exam.entity.Cinema;
import kg.exam.entity.Film;
import org.hibernate.Session;

import java.time.LocalDateTime;
import java.util.List;

public interface SessionService {
    Session create(Session session);
    List<Session> getAll();
    Session getByCinemaId(Cinema id);
    Session getByDateTime(Cinema id, LocalDateTime time);
    Session getByFilm(Film name);

}

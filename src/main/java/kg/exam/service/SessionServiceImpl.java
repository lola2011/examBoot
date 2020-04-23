package kg.exam.service;

import kg.exam.entity.Cinema;
import kg.exam.entity.Film;
import kg.exam.repository.SessionRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SessionServiceImpl implements SessionService {
    @Autowired
    private SessionRepository sessionRepository;
    @Autowired
    private CinemaService cinemaService;
    @Override
    public Session create(Session session1) {
        return sessionRepository.save(session1);
    }

    @Override
    public List<Session> getAll() {
        return sessionRepository.findAll();
    }

    @Override
    public Session getByCinemaId(Long id) {
        Cinema cinema= cinemaService.getById(id);
        return sessionRepository.findAll().
    }

    @Override
    public Session getByDateTime(Cinema id, LocalDateTime time) {
        return create(session1);
    }

    @Override
    public Session getByFilm(Film name) {
        return null;
    }
}

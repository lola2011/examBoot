package kg.exam.controller;

import kg.exam.service.SessionService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static javax.swing.text.html.HTML.Tag.S;

@RestController
@RequestMapping("/session")
public class SessionController {
    @Autowired
    private SessionService sessionService;

    @PostMapping
    public Session create(@RequestBody Session session1) {
        return sessionService.create(session1);}

        @GetMapping
                public List<Session> getAll()
    {
            return sessionService.getAll();
        }

    }


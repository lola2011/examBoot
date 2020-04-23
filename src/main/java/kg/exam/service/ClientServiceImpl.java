package kg.exam.service;

import kg.exam.entity.Client;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    @Override
    public Client create(Client client) {
        if (client.getAge() > 16) {
            create(client);
        }return null;
}}

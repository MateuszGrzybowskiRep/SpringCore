package info.grzyb.spring.implementation;

import info.grzyb.spring.api.Logger;
import info.grzyb.spring.api.UsersRepository;
import info.grzyb.spring.domain.User;

public class UsersRepositoryImpl implements UsersRepository {
    private Logger logger;

    public User createUserClass(String name) {
        logger.log("Tworzenie "+name);
        return new User(name);
    }

    public void setLogger(Logger logger) {
        this.logger = logger;


    }
}

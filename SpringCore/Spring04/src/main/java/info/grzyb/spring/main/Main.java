package info.grzyb.spring.main;

import info.grzyb.spring.api.Logger;
import info.grzyb.spring.api.UsersRepository;
import info.grzyb.spring.domain.User;
import info.grzyb.spring.implementation.LoggerImpl;
import info.grzyb.spring.implementation.UsersRepositoryImpl;

public class Main {

    public static void main(String[] args) {

        Logger logger = new LoggerImpl();
        UsersRepository usersRepository = new UsersRepositoryImpl();
        usersRepository.setLogger(logger);

        User user = usersRepository.createUserClass("jan");
    }
}

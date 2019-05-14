package info.grzyb.spring.api;

import info.grzyb.spring.domain.User;

public interface UsersRepository {
    User createUserClass(String name);
    void setLogger(Logger logger);
}

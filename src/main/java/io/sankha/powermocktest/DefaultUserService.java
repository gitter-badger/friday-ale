package io.sankha.powermocktest;

/**
 * Created by User on 04-06-2017.
 */
public class DefaultUserService implements UserService {
    @Override
    public User getUserById(final Long userId) {
        return null;
    }

    @Override
    public void updateUserDetails(final User newUserDetails) {
    }

    @Override
    public void createUser(final User user) {
    }

    @Override
    public Long getUserCount() {
        throw new UnsupportedOperationException("Not implemented");
    }
}
